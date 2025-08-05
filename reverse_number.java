import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to reverse");
        int num = sc.nextInt();
        int k=1;
        while(k!=0)
        {
            int m=num%10;
            k=num/10;
            num=k;
            System.out.print(m);
        }
    }
}
