import java.util.Scanner;
public class gcd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int greaterNumber=n2;
        int gcd=1;
        if(n1>n2)
            greaterNumber=n1;
            int index=2;
            while(index<=greaterNumber && greaterNumber>2)
            {
                if((n1%index==0) && (n2%index==0))
                {
                    gcd=index;
                }
                index++;
            }
            System.out.println(gcd);
    }
}
