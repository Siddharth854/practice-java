public class median_sorted_array{
    public static void main(String[] args)
    {
        char nums1[]={1,2};
        int nums2[]={3,4};
        int l1 = nums1.length;
        int l2 = nums2.length;
        int len = l1 + l2;
        int[] nums = new int[len];
        int i = 0, j = 0, k = 0;
        while(i < l1 && j < l2)
        {
            if(nums1[i]<nums2[j])
            {
                nums[k++] = nums1[i++];
            }else
            {
                nums[k++] = nums2[j++];
            }
        }
        while(i < l1)
        {
            nums[k++] = nums1[i++];
        }
        while(j < l2)
        {
            nums[k++] = nums2[j++];
        }
        double median;
        if(len % 2 == 0)
        {
            median = (nums[len/2-1] + nums[len/2])/2.0;
            // 1 2 3 4 5 6 7 8 9 10
            // 5 + 6 / 2.0 => [5.5]
        }else
        {
            median = nums[len/2];
        }
        System.out.println(median);
    }
}