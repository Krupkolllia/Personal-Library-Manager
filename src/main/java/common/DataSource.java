package common;

import java.util.ArrayList;

public interface DataSource<T> {
    public T giveById(int id);

    public ArrayList<T> giveAll();

    public void add(T item);

    public void delete(int id);
}
