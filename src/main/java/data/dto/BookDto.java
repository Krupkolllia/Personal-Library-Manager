package data.dto;

import java.util.ArrayList;
import java.util.Date;

public record BookDto(
        int id,
        String title,
        String author,
        int year,
        int pages,
        Date timeAdded,
        ArrayList<Content> content
) {}
