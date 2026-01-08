package presentation;

import data.dto.Content;

public record BookUI(String title, String author, int year, int pages, Content content) {}
