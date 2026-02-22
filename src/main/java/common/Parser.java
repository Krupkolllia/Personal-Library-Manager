package common;

import java.io.File;
import java.io.IOException;

public interface Parser<T extends Dto> {

    T parse(File file) throws IOException;

}
