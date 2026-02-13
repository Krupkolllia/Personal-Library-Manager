package common;

import java.io.IOException;
import java.io.InputStream;

public interface FileSource {
    InputStream getFile(String path) throws IOException;
}
