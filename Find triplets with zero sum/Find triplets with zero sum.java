// Brute force solution in O(n^3) Time 
class Solution
{
    
	public boolean findTriplets(int arr[] , int n)
    {
        if(n<3)
        return false;
        
       for(int i = 0 ;i<n;i++)
       {
            
         
           for(int j = i+1;j<n;j++)
           {   
               for(int k = j+1;k<n;k++)
               {
                    
                   if( arr[i]+arr[j]+arr[k]==0)
                   return true;
               }
           }
       }
       return false;
    }
}

// Efficient solution  in O(n^2) Time
class Solution
{
    
	public boolean findTriplets(int arr[] , int n)
    {
        if(n<3)
        return false;
        Arrays.sort(arr);
       for(int i = 0 ;i<n-1;i++)
       {
         if(twoPointerAp(arr,arr[i],i+1,n-1))
         return true;
       }
       return false;
    }
    private boolean twoPointerAp(int []a ,int sum , int i, int j ){
        int tsum = 0 ;
        while(i<j)
        {
            tsum = sum + a[i]+a[j] ;
            if(tsum==0)
            return true;
            else if(tsum<0)
            i++ ;
            else
            j--;
        }
        return false;
    }
}
