// public class find_duplicate {
//     public static void main(String[] args)
//     {
//         int arr[]={1,2,3,2,1,0,0};
//         int i,j,n=arr.length;
//         for(i=0;i<n-1;i++)
//         {
//             for(j=i+1;j<n;j++)
//             {
//                 if((arr[i]==arr[j]) && (i!=j) )
//                 {
//                     System.out.print(arr[i]+" ");
//                 }
//             }
//         }
//     }
// }

import java.util.HashSet;
import java.util.Set;
public class find_duplicate
{
    public static void main(String[] args)
    {
    int arr[]={1,7,3,0,0,76,34,1,2,6,3};
    Set<Integer> s = new HashSet<>();
    for(int no:arr)
        {
            if(s.add(no)==false)
            {
                System.out.println(no+" ");
            }
        }
    }
}
