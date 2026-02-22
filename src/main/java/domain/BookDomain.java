package domain;

import java.util.UUID;

public record BookDomain(UUID id, String title, String author, String year, int pages) {}