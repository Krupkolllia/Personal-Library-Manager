package domain;

import common.Repository;

import java.util.ArrayList;

// Main features(add, delete, getAll, getByid) are in Repository<T>
public interface BookRepository extends Repository<BookDomain> {

    BookDomain getByTitle(String title);

    ArrayList<BookDomain> getBooksByAuthor(String author);

}
