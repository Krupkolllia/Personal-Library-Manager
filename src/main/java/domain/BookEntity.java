package domain;

public class BookEntity {
    BookDomain book;
    int currentPage;

    public BookEntity(BookDomain book) {
        this.book = book;
        this.currentPage = 1;
    }


    // changes current page to next
    void nextPage() {
        if (currentPage < book.pages()) {
            currentPage++;
        }
    }

    // changes current page to previous
    void previousPage() {
        if (currentPage > 1) {
            currentPage--;
        }
    }

    // changes current page to given
    void toPage(int pageNumber) {
        if (pageNumber < 1 || pageNumber > book.pages()) {
            throw new IllegalArgumentException("Invalid page number");
        }
        currentPage = pageNumber;
    }


}
