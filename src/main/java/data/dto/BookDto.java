package data.dto;

import common.Dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public record BookDto(
        UUID id,
        String title,
        String author,
        String year,
        int pages,
        LocalDate timeAdded,
        List<Content> content
) implements Dto {}
