package common;

import java.util.ArrayList;
import java.util.Optional;

public interface Repository<T> {
    public T getById(int id);

    public ArrayList<T> getAll();

    public void add(T item);

    public void delete(int id);
}
