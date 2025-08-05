// import java.util.*;
// class single_occurance_element {
//     public static void main(String args[]) {
//         int a[] = {2, 2, 3, 3, 4, 4, 6, 5, 5};
//         Arrays.sort(a);  // Required for binary search logic

//         int n = a.length;
//         int st = 0, end = n - 1;
//         int
//  result = -1;

//         while (st <= end) {
//             int mid = st + (end - st) / 2;

//             // Edge case: only one element
//             if (n == 1) {
//                 result = a[0];
//                 break;
//             }

//             // Edge case: mid is at the start
//             if (mid == 0 && a[mid] != a[mid + 1]) {
//                 result = a[mid];
//                 break;
//             }

//             // Edge case: mid is at the end
//             if (mid == n - 1 && a[mid] != a[mid - 1]) {
//                 result = a[mid];
//                 break;
//             }

//             // Unique element found
//             if (a[mid] != a[mid - 1] && a[mid] != a[mid + 1]) {
//                 result = a[mid];
//                 break;
//             }

//             // Binary search logic
//             if ((mid % 2 == 0 && a[mid] == a[mid + 1]) || (mid % 2 == 1 && a[mid] == a[mid - 1])) {
//                 st = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         System.out.println("Single occurrence element: " + result);
//     }
// }
import java.util.*;
class single_occurance_element
{
    public static void main(String[] args) {
        int arr[]={2,2,3,3,1,2,2};
        Arrays.sort(arr);
        int n = arr.length;
        int start=0,end=n-1;
        int result=-1;
        while(start<end) 
        { 
            int mid = start+(end-start)/2; 
            if(n==1)
            {
                result=arr[mid];
                break;
            }
            if(mid==0 && arr[mid]!=arr[mid+1])
            {
                result = arr[mid];
                break;
            }
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                result = arr[mid];
                break;
            }
        }
        System.out.println(result);
    }
}
