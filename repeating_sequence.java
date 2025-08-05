class repeating_sequence
{
    public static void main(String[] args)
    {
        int arr[]={47,56,47,56,2,0,00};
        int freq[]=new int[arr.length];
        int i,j,ctr;
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
                System.out.println(arr[i]+" --> "+freq[i]);
            }
        }
    }
}