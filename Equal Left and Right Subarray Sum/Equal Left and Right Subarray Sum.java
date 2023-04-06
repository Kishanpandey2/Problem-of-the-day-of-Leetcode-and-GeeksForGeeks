// Brute Force solution 

class Solution{
	int equalSum(int [] A, int N) {
		for(int i = 0 ;i<N;i++){
		    int leftSum = 0  , rightSum = 0  ;
		    
		    for(int j = 0 ;j<i ;j++)
		    leftSum += A[j] ;
		    
		    for(int k = i+1 ;k<N;k++)
		    rightSum += A[k] ;
		    
		    if(leftSum == rightSum)
		    return i+1 ;
		}
		return -1 ;
	}
}



// Efficient Solution 
class Solution{
	int equalSum(int [] A, int N) {
		long totalSum = 0 ;
		for(int i :A)
		totalSum += i ;
		
		long prefixSum =0;
		for(int i = 0  ;i<N;i++)
		{
		    totalSum -= A[i] ;
		    
		    if(totalSum == prefixSum)
		    return i+1 ;
		    else
		    prefixSum += A[i] ;
		}
		return -1 ;
	}
}
