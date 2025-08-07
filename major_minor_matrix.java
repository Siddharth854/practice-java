import java.util.Scanner;
public class major_minor_matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix(n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the element of the matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
    // Input Matrix Elements
    System.out.println("The elements of the matrix are : ");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(matrix[i][j]+"\t");
        }
        System.out.println();
    }
    //Major Diagonal (i==j)
    System.out.println("Major Diognal Elements: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(matrix[i][i]+" ");
    }
    System.out.println();
    //minor Diagonal 
    System.out.println("Minor Digonal Elements: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(matrix[i][n-1-i]+" ");
    }
    }
}