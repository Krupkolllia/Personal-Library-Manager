package data.parser;

import com.kursx.parser.fb2.*;
import data.dto.BookDto;
import data.dto.Content;
import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.*;
import java.lang.String;



public class Fb2BookParser implements BookParser {
    @Override
    public BookDto parse(File file) throws IOException {
        FictionBook book = null;
        try {
            book = new FictionBook(file);
        } catch (ParserConfigurationException | SAXException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            throw new IOException(e);
        }

        return new BookDto(
                UUID.randomUUID(),
                book.getTitle(),
                book.getAuthors().toString(),
                book.getDescription().getPublishInfo().getYear(),
                calculatePages(book, 1800),
                LocalDate.now(),
                getContent(book)
        );

    }

    private int calculatePages(FictionBook book, int charsPerPage) {
        StringBuilder sb = new StringBuilder();

        List<Section> sections = book.getBody().getSections();
        for (Section section : sections) {
            Deque<Section> stack = new ArrayDeque<>();
            stack.push(section);

            while (!stack.isEmpty()) {
                Section current = stack.pop();

                for (Element e : current.getElements()) {
                    sb.append(e.getText());
                }

                List<Section> subs = current.getSections();
                for (Section sub : subs) {
                    stack.push(sub);
                }
            }
        }

        int totalChars = sb.length();
        return (totalChars + charsPerPage - 1) / charsPerPage;
    }


    private ArrayList<Content> getContent(FictionBook book) {
        List<Section> sections = book.getBody().getSections();
        ArrayList<Content> contents = new ArrayList<>();

        for (Section section : sections) {
            ArrayList<Title> titles = section.getTitles();
            ArrayList<String> paragraphs = new ArrayList<>();

            for (Element element : section.getElements()) {
                paragraphs.add(element.getText());
            }


        }

        return contents;

    }

//    private void processSection(Section section, int level, List<Content> contents) {
//        String headingText = section.getTitleString("\n", "\n");
//        if (headingText == null) headingText = "";
//        StringBuilder textBuilder = new StringBuilder();
//
//        collectParagraphs(section, textBuilder);
//
//        Heading heading = new Heading(level, headingText);
//        Paragraph paragraph = new Paragraph(textBuilder.toString().trim());
//
//        contents.add(new Content(heading, paragraph));
//    }

    // рекурсивно собираем текст из параграфов и вложенных секций
    private void collectParagraphs(Section section, StringBuilder sb) {
        for (Element element : section.getElements()) {
            if (element.getText() != null && !element.getText().isEmpty()) {
                sb.append(element.getText()).append("\n");
            }
        }
        for (Section sub : section.getSections()) {
            collectParagraphs(sub, sb);
        }
    }
}

