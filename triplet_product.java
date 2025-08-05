public class triplet_product {
    public static void main(String args[])
    {
        int arr[]={-10, -3, -5, -6, -20};
        int n = arr.length;
        int max_product=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    max_product=Math.max(max_product,arr[i]*arr[j]*arr[k]);
                }
            }
        }
        System.out.println("Maximum product of three Numbers is: "+max_product);
        System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
    }
}
