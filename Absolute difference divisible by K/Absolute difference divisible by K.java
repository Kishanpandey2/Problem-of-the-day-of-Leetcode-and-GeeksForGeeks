class Solution {
	static long countPairs(int n, int[] arr, int k) {
		
		int rem[] = new int[k] ;
		for(int i : arr)
		{
		    rem[i%k]++ ;
		}
		long res = 0;
		for(int i= 0 ;i<k ;i++)
		{
		   res+= (rem[i]-1)*rem[i]/2 ;
		}
		return res ;
	}
}


Expected Time Complexity: O(n + k)
Expected Auxiliary Space: O(k)
