package data;

import common.DataSource;
import data.dto.BookDto;

import java.util.ArrayList;

public class BookDataSource implements DataSource<BookDto> {
    @Override
    public BookDto giveById(int id) {
        return null;
    }

    @Override
    public ArrayList<BookDto> giveAll() {
        return null;
    }

    @Override
    public void add(BookDto item) {

    }

    @Override
    public void delete(int id) {

    }
}
