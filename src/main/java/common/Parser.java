package common;

import java.io.InputStream;

public interface Parser<T> {

    T parse(InputStream inputStream);

}
