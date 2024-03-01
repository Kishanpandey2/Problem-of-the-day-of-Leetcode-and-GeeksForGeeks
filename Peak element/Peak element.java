// Naive solution

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       
       for( int i= 0;i<n;i++)
       {
           if( (i== 0 || arr[i-1]<=arr[i] ) && ( i == n-1 || arr[i+1]<=arr[i]))return i ;
           
       }
       
       return -1;
    }
}


// Efficient solution

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       
        int low = 0 ,high = n-1 ;
      while(low<=high)
      {
          int mid = (low+high)/2 ;
          
          if((mid==0 || arr[mid]>=arr[mid-1] )&&(mid == n-1 || arr[mid]>=arr[mid+1]))
          return mid ;
          else if(mid >0 && arr[mid]<=arr[mid-1])
          high = mid-1 ;
          else low = mid+1;
      }
      return -1;
    }
}
