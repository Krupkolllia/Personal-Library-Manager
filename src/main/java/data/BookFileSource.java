package data;

import common.FileSource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BookFileSource implements FileSource {
    @Override
    public InputStream getFile(String path) throws IOException {
        return Files.newInputStream(Path.of(path));
    }
}
