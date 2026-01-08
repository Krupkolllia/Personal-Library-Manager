package data.parser;

import common.FileParser;
import data.dto.BookDto;

import java.io.File;

public class TxtBookParser implements FileParser<BookDto> {
    @Override
    public BookDto parse(File file) {
        return null;
    }
}
