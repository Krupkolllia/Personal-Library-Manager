package common;

import java.io.IOException;

public abstract class DataSource<T> {
    public Parser<T> parser;
    public FileSource source;

    public DataSource(Parser<T> parser, FileSource source) {
        this.parser = parser;
        this.source = source;
    }

    public void setParser(Parser<T> parser) {
        this.parser = parser;
    }

    public void setSource(FileSource source) {
        this.source = source;
    }

    public T getFileDto(String path) throws IOException {
        return parser.parse(source.getFile(path));
    }
}
