package data;

import common.DataSource;
import common.FileSource;
import common.Parser;
import common.SourceKey;
import data.dto.BookDto;
import data.parser.BookParser;

import java.io.File;
import java.io.IOException;


public class BookDataSource extends DataSource<BookDto> {

    public BookDataSource(BookParser parser, FileSource source) {
        super(parser, source);
    }

    @Override
    public void setParser(Parser<BookDto> parser) {
        this.parser = parser;
    }

    @Override
    public void setFileSource(FileSource source) {
        this.fileSource = source;
    }

    @Override
    public BookDto load(SourceKey key) throws IOException {
        File file = fileSource.getFile(key);

        return parser.parse(file);

    }
}
