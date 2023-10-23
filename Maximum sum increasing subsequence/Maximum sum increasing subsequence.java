
class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int []msis = new int[n] ;
	    msis[0] = arr[0] ;
	    int res = arr[0] ;
	    
	    for(int i= 1 ;i<n;i++){
	        msis[i] = arr[i] ;
	        for(int j = 0 ;j<i;j++)
	        {
	            if(arr[j]<arr[i] && msis[i]<msis[j]+arr[i]) 
	            msis[i] = msis[j]+arr[i] ;
	        }
	        res = Math.max(res,msis[i]) ;
	    }
	    
	    return res;
	}  
}
