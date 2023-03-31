class Solution{
	int [] lexicographicallyLargest(int [] arr, int n) {
	 int i = 0 ;
	 
	 while(i<n ){
	     
	     int j ;
	     
	     for( j = i+1 ;j<n && arr[j]%2==arr[j-1]%2 ;j++){}
	     
	     helperFunction(arr,i,j) ;
	     i = j ;
	 }
	 return arr ;
	}
	
	void helperFunction(int []arr,int i ,int j){
	    
	    Arrays.sort(arr,i,j) ;
	    
	    while(i<j){
	        j-- ;
	        int temp = arr[i] ;
	        arr[i] = arr[j] ;
	        arr[j] = temp ;
	        i++ ;
	        
	    }
	}
}
