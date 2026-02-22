package common;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FileSource {
    private Source source;


    public FileSource(Source source) {
        this.source = Objects.requireNonNull(source);
    }

    public void setSource(Source source) {
        this.source = source;
    }


    public File getFile(SourceKey key) throws IOException {
        return source.load(key);
    }
}
