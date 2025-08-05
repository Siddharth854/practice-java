class count_repeat {
    public static void main(String[] args) {
        int arr1[] = {2, 2, 4, 23, 25, 23};
        int freq[] = new int[arr1.length];
        int i, j, ctr;
        int n = arr1.length;
        for (i = 0; i < n; i++) {
            freq[i] = -1;
        } 
        for (i = 0; i < n; i++) {
            ctr = 1;
            for (j = i+1; j<n; j++) { 
                if (arr1[i] == arr1[j]) {
                    ctr++;
                    freq[j] = 0; 
                } 
            }
            if (freq[i] != 0) {
                freq[i] = ctr;
            } 
        } 
        for (i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println(arr1[i] + " occurs " + freq[i] + " times"); 
            }
        }
    }
}
