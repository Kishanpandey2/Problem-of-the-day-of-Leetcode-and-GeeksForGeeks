
class Solution{
    
    static long countSubarrays(int arr[], int n, int L, int R)  
    { 
            int i=0,j,m=0;
        long count=0;
        for(j=0;j<n;j++)
        {
            if(arr[j]>R)
            {
                m=0;
                i=j+1;
            }
            else if(arr[j]>=L && arr[j]<=R)
            {
                m=j-i+1;
                count+=m;
            }
            else
            {
                count+=m;
            }
        }
        return count;
    } 
}

