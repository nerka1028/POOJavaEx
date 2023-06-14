package Entity;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private int pages;
    
    public Book() {
    }
    public Book(String iSBN, String title, String author, int pages) {
        ISBN = iSBN;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    
}
