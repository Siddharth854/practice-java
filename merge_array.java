class merge_array {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};

        int s1 = arr1.length;
        int s2 = arr2.length;
        int s3 = s1 + s2;

        int[] result_arr = new int[s3];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < s1 && j < s2) {
            if (arr1[i] < arr2[j]) {
                result_arr[k++] = arr1[i++];
            } else {
                result_arr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < s1) {
            result_arr[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < s2) {
            result_arr[k++] = arr2[j++];
        }

        // Print merged array
        System.out.print("Merged Array: ");
        for (int m = 0; m < s3; m++) {
            System.out.print(result_arr[m] + " ");
        }
    }
}
