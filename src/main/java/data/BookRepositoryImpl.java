package data;

import common.DataSource;
import data.dto.BookDto;
import domain.BookDomain;
import domain.BookRepository;

import java.util.ArrayList;
import java.util.Optional;

public class BookRepositoryImpl implements BookRepository {
    private DataSource<BookDto> dataSource;

    public BookRepositoryImpl(DataSource<BookDto> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public BookDomain getByTitle(String title) {
        return null;
    }

    @Override
    public ArrayList<BookDomain> getBooksByAuthor(String author) {
        return null;
    }

    @Override
    public Optional<BookDomain> getById(int id) {
        return Optional.empty();
    }

    @Override
    public ArrayList<BookDomain> getAll() {
        return null;
    }

    @Override
    public void add(BookDomain item) {

    }

    @Override
    public void delete(int id) {

    }
}
