package common;

import java.io.File;
import java.io.IOException;

public interface Source {
    File load(SourceKey key) throws IOException;
}
