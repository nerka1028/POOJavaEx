package EJ1Bookstore;
import Entity.Book;
import Services.BookServices;
public class EJ1Bookstore {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BookServices bookServices = new BookServices();
        Book book = new Book();
        bookServices.loadBook(book);
        bookServices.showBook(book);
    }
}
