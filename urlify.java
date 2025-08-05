import java.util.Scanner;
public class urlify {
    public static String url(String str)
    {
        return str.trim().replaceAll(" ","%20");
    }
    public static void main(String[] main)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer=url(str);
        System.out.println("URL string is: "+answer);
    }
}
