// public class remove_dups {
//     public static void main(String args[])
//     {
//         int arr[]={1,1,2,2,3,3,4,4,5,5,6};
//         int temp[]=new int[arr.length];
//         int j=0;
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i]!=arr[i+1])
//             {
//                 temp[j]=arr[i];
//                 j++;
//             }
//         }
//         temp[j]=arr[arr.length-1];
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(temp[i]+" ");
//         }
//     }
// }

// public class remove_dups {
//     public static void main(String args[])
//     {
//         int arr[]={1,1,2,2,3,3,4,4,5,5,6};
//         //int temp[]=new int[arr.length];
//         int j=0;     
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i]!=arr[i+1])                
//             {
//                 arr[j]=arr[i];
//                 j++;
//             }
//         }
//         arr[j]=arr[arr.length-1];
//         for(int i=0;i<j+1;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


import java.util.HashSet;
public class remove_dups
{
    public static void main(String args[])
    {
        int arr[]={1,7,3,0,00,76,34,1,2,6,3};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        for(int no:hs)
        {
            System.out.print(no+" ");
        }
    }
}
