import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class hw_static {
    // 1.Given a database table “Book” with columns (id, isbn, name, author, publish
    // date),
    // define a java class that matches this table and
    // then use a static block to initialize this table with some records
    public static class Book {
        private int id;
        private String isbn;
        private String name;
        private String author;
        private Date publishDate;

        public Book(int id, String isbn, String name, String author, Date publishDate) {
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }
    }

    // 2.2) Define a Java class “BookSeller” and then define a static inner class
    // “Book”,
    // and use a static method “sellBooks” to initialize several books, and in the
    // main method display all the books by calling the “sellBooks” method
    public static class BookSeller {
        public static List<Book> sellBooks() {
            List<Book> bookList = new ArrayList<>();
            bookList.add(new Book(1, "isbn1", "Java", "Me", new Date()));
            return bookList;
        }

        public static void main(String[] args) {
            for (Book book : sellBooks()) {
                System.out.println(book);
            }
        }
    }
}
