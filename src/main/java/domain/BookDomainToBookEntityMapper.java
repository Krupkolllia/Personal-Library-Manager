package domain;

import common.Mapper;

public class BookDomainToBookEntityMapper implements Mapper<BookDomain, BookEntity> {
    @Override
    public BookEntity map(BookDomain from) {
        return new BookEntity(from);
    }
}
