package data.mapper;

import common.Mapper;
import data.dto.BookDto;
import domain.BookDomain;

public class BookDataToDomainMapper implements Mapper<BookDto, BookDomain> {
    @Override
    public BookDomain map(BookDto from) {
        return new BookDomain(
                from.id(),
                from.title(),
                from.author(),
                from.year(),
                from.pages()
        );
    }

}
