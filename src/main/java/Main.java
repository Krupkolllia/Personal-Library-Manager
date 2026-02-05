import data.BookDataSource;
import data.BookFileSource;
import data.parser.EpubBookParser;

public class Main {
    public static void main(String[] args) {
        var source = new BookDataSource(new EpubBookParser(), new BookFileSource());
        System.out.println(source.getFile(" "));
    }
}
