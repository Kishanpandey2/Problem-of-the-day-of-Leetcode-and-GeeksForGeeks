class Solution{
	int minSteps(String str) {
		int count = 0  ;
		
		for(int i = 1 ;i<str.length() ;i++){
		    if(str.charAt(i-1)!=str.charAt(i))
		    count++ ;
		}
		
		if(count%2!=0)
		return (count+1)/2 +1 ;
		
		return count/2 + 1 ;
	}
}
