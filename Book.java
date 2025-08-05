public class Book 
{
    String title;
    String author;
    float price;
    public Book()
    {
        this.title="unknown";
        this.author="unknown";
        this.price=0.0f;
    }
    public Book(String title, String author)
    {
        this.title=title;
        this.author=author;
    }
    public Book(String title, String author, float price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public static void main(String[] args)
    {
        System.out.println("----------------------------------------");
        Book b1 = new Book();
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println("----------------------------------------");

        Book b2 = new Book("the Road not taken","samuel taylor");
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println("----------------------------------------");


        Book b3 = new Book("Polity","M Lakshmikant",850);
        System.out.println(b3.title);
        System.out.println(b3.author);
        System.out.println(b3.price);
        System.out.println("----------------------------------------");
    }
}
