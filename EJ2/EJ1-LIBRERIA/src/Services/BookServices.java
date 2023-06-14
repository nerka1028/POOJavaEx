package Services;
import Entity.Book;
import java.util.Scanner;
public class BookServices {
    
    public void loadBook(Book book){
        Scanner read = new Scanner(System.in);
        System.out.println("Loading book: ");
        System.out.println("ISBN: ");
        book.setISBN(read.nextLine());
        System.out.println("Title: ");
        book.setTitle(read.nextLine());
        System.out.println("Author: ");
        book.setAuthor(read.nextLine());
        System.out.println("Pages: ");
        book.setPages(read.nextInt());
    }

    public static void showBook(Book book){
        System.out.println("Showing book: ");
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("TItle: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getPages());
    }
}
