import java.util.ArrayList;
public class Book_ArrayList 
{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book_ArrayList> bookCollection = new ArrayList<Book_ArrayList>();

    public Book_ArrayList(String title, String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    public static void add_Book(Book_ArrayList book)
    {
        bookCollection.add(book);
    }
    public static void remove_Book(Book_ArrayList book)
    {
        bookCollection.remove(book);
    }
    public static ArrayList<Book_ArrayList> getBookCollection()
    {
        return bookCollection; 
    }
    public static void main(String[] args)
    {
        Book_ArrayList b1 = new Book_ArrayList("Harry Potter","JK Rowlings","1234567890");
        Book_ArrayList b2 = new Book_ArrayList("the time machine","HG Well","0987654321");
        
        Book_ArrayList.add_Book(b1);
        System.out.println("\nThe book is: " + b1.getTitle()+"\n The author is: "+b1.getAuthor()+"\n The ISBN is: "+b1.ISBN);
        Book_ArrayList .add_Book(b2);
        System.out.println("\n The book is: " + b2.getTitle()+"\n The author is: "+b2.getAuthor()+"\n The ISBN is: "+b2.ISBN);
        System.out.println("List of books:");
        for(Book_ArrayList book: bookCollection)
        {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
