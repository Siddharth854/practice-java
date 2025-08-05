public class butterfly_pattern {
    public static void main(String[] args)
    {   //left
        int i,j,n=7;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
        //bottom
        for(i=n;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
