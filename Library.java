import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    public Library()
    {
        books = new ArrayList<Book>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void removeBook(Book book)
    {
        books.remove(book);
    }
    public ArrayList<Book> getBooks()
    {
        return books;
    }
    public static void main(String[] args)
    {
        Library lib = new Library();
        Books b1 = new Books("Time Travel","HG Wells");
        Books b2 = new Books("Harry Potter","JK Rowlings");
        Books b3 = new Books("lord of the ring","JRR Tolekin");
        lib.addBook(b1);
        lib.addBook(b2);    
        lib.addBook(b3);
        
    }
}
