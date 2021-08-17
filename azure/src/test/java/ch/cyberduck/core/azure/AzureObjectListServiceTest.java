package ch.cyberduck.core.azure;

import ch.cyberduck.core.AlphanumericRandomStringService;
import ch.cyberduck.core.AttributedList;
import ch.cyberduck.core.DisabledListProgressListener;
import ch.cyberduck.core.DisabledLoginCallback;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.NotfoundException;
import ch.cyberduck.core.features.Delete;
import ch.cyberduck.core.io.HashAlgorithm;
import ch.cyberduck.core.transfer.TransferStatus;
import ch.cyberduck.test.IntegrationTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@Category(IntegrationTest.class)
public class AzureObjectListServiceTest extends AbstractAzureTest {


    @Test(expected = NotfoundException.class)
    public void testListNotFoundFolder() throws Exception {
        final Path container = new Path("cyberduck", EnumSet.of(Path.Type.volume));
        new AzureObjectListService(session).list(new Path(container, "notfound", EnumSet.of(Path.Type.directory)), new DisabledListProgressListener());
    }

    @Test
    public void testListEmptyFolder() throws Exception {
        final Path container = new Path("cyberduck", EnumSet.of(Path.Type.volume));
        final Path folder = new AzureDirectoryFeature(session).mkdir(new Path(container, UUID.randomUUID().toString(), EnumSet.of(Path.Type.directory)), new TransferStatus());
        assertTrue(new AzureObjectListService(session).list(folder, new DisabledListProgressListener()).isEmpty());
        new AzureDeleteFeature(session).delete(Collections.singletonList(folder), new DisabledLoginCallback(), new Delete.DisabledCallback());
    }


    @Test(expected = NotfoundException.class)
    public void testListNotfoundContainer() throws Exception {
        final Path container = new Path("notfound-cyberduck", EnumSet.of(Path.Type.volume));
        new AzureObjectListService(session).list(container, new DisabledListProgressListener());
    }

    @Test
    public void testList() throws Exception {
        final Path container = new Path("cyberduck", EnumSet.of(Path.Type.volume));
        final Path directory = new AzureDirectoryFeature(session).mkdir(new Path(container, new AlphanumericRandomStringService().random(), EnumSet.of(Path.Type.directory)), new TransferStatus());
        final Path file = new Path(directory, new AlphanumericRandomStringService().random(), EnumSet.of(Path.Type.file));
        assertTrue(new AzureObjectListService(session).list(directory, new DisabledListProgressListener()).isEmpty());
        new AzureTouchFeature(session).touch(file, new TransferStatus());
        final AttributedList<Path> list = new AzureObjectListService(session).list(directory, new DisabledListProgressListener());
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertTrue(list.contains(file));
        assertEquals(HashAlgorithm.md5, list.get(0).attributes().getChecksum().algorithm);
        new AzureDeleteFeature(session).delete(Arrays.asList(file, directory), new DisabledLoginCallback(), new Delete.DisabledCallback());
    }

    @Test
    public void testListLexicographicSortOrderAssumption() throws Exception {
        final Path container = new Path("cyberduck", EnumSet.of(Path.Type.volume, Path.Type.directory));
        final Path directory = new AzureDirectoryFeature(session).mkdir(
            new Path(container, new AlphanumericRandomStringService().random(), EnumSet.of(Path.Type.directory)), new TransferStatus());
        assertTrue(new AzureObjectListService(session).list(directory, new DisabledListProgressListener()).isEmpty());
        final List<String> files = Arrays.asList(
            "aa", "0a", "a", "AAA", "B", "~$a", ".c"
        );
        for(String f : files) {
            new AzureTouchFeature(session).touch(new Path(directory, f, EnumSet.of(Path.Type.file)), new TransferStatus());
        }
        files.sort(session.getHost().getProtocol().getListComparator());
        final AttributedList<Path> list = new AzureObjectListService(session).list(directory, new DisabledListProgressListener());
        for(int i = 0; i < list.size(); i++) {
            assertEquals(files.get(i), list.get(i).getName());
            new AzureDeleteFeature(session).delete(Collections.singletonList(list.get(i)), new DisabledLoginCallback(), new Delete.DisabledCallback());
        }
        new AzureDeleteFeature(session).delete(Collections.singletonList(directory), new DisabledLoginCallback(), new Delete.DisabledCallback());
    }
}
