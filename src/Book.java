import java.time.LocalDate;

public class Book {
    private String title;
    private int page;
    private String author;
    private LocalDate publishDate;

    public Book(String title, int page, String author, LocalDate publishDate) {
        this.title = title;
        this.page = page;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }
}
