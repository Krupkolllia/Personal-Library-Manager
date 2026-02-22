package common;

import java.io.IOException;
import java.util.Objects;

public abstract class DataSource<T extends Dto> {
    protected Parser<T> parser;
    protected FileSource fileSource;

    public DataSource(Parser<T> parser, FileSource source) {
        this.parser = Objects.requireNonNull(parser);
        this.fileSource = Objects.requireNonNull(source);
    }

    public abstract void setParser(Parser<T> parser);

    public abstract void setFileSource(FileSource source);

    public abstract T load(SourceKey key) throws IOException;
}
