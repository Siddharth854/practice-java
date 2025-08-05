class repeating_count
{
    public static void main(String[] args)
    {
        int arr[]={3,3,2,2,1,1};
        int freq[]=new int[arr.length];
        int i, j, ctr;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            freq[i]=-1;
        }
        for(i=0;i<n;i++)
        {
            ctr=1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    ctr++;
                    freq[j]=0;
                } 
            }
            if(freq[i]!=0)
            {
                freq[i]=ctr;
            }
        }
        for(i=0;i<n;i++)
        {
            if(freq[i]!=0)
            {
                System.out.println(arr[i]+" occurs "+freq[i]+" times");
            }
        }
    }
}
