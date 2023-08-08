import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add( new Book("1",100,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("2",150,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("3",200,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("4",140,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("5",100,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("6",100,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("7",270,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("8",250,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("9",100,"Autor1", LocalDate.of(2000,1,1)));
        books.add( new Book("10",100,"Autor1", LocalDate.of(2000,1,1)));

        Map<String, String> bookToMap = books.stream().collect(Collectors.toMap(Book::getTitle,Book::getAuthor));

        System.out.println("Kitaplar ve yazarlar:");
        bookToMap.forEach((title, author) -> System.out.println(title + " - " + author));

        List<Book> filteredBook = books.stream().filter(book -> book.getPage() > 100).collect(Collectors.toList());


        System.out.println("\nSayfa Sayısı 100'den Fazla Olan Kitaplar:");
        filteredBook.forEach(book -> System.out.println(book.getTitle() + " - " + book.getAuthor()));
    }

    }

