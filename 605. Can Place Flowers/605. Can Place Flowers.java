class Solution {
     public boolean canPlaceFlowers(int[] flowerbed, int n) {
		 if(n == 0) {
			 return true;
		 }
		 int count = 0;
	     for(int i =0;i<flowerbed.length;i++) {
	    	 if(flowerbed[i] == 0 && isAvailable(flowerbed, i)) {
	    		 flowerbed[i] = 1;
	    		 count++;
	    		 if(count == n) {
	    			 return true;
	    		 }
	    	 }
	     }
	     return false;
	    }
	 
	 
	 public boolean isAvailable(int[] flowerbed,int index) {
		 if((index-1>=0 && flowerbed[index-1] == 1) || (index+1<flowerbed.length && flowerbed[index+1] ==1)) {
			 return false;
		 }
		 
		 return true;
	 }
}
