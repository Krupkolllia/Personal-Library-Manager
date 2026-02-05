package data;

import common.DataSource;
import common.FileSource;
import common.Parser;
import data.dto.BookDto;
import data.parser.BookParser;

import java.util.ArrayList;

public class BookDataSource extends DataSource<BookDto> {

    public BookDataSource(BookParser parser, FileSource source) {
        super(parser, source);
    }
}
