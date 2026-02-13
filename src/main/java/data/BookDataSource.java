package data;

import common.DataSource;
import common.FileSource;
import data.dto.BookDto;
import data.parser.BookParser;


public class BookDataSource extends DataSource<BookDto> {

    public BookDataSource(BookParser parser, FileSource source) {
        super(parser, source);
    }
}
