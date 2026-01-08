package common;

import java.io.File;

public interface FileParser<T> {

    public T parse(File file);

}
