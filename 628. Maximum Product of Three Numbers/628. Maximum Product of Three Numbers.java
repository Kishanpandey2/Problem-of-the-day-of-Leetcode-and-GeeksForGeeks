class Solution {
    public int maximumProduct(int[] arr) {
         
         int min1 = Integer.MAX_VALUE ;
        int min2 = Integer.MAX_VALUE ;
        int min3 = Integer.MAX_VALUE ;
        
        int mx1 = Integer.MIN_VALUE ;
        int mx2 = Integer.MIN_VALUE ;
        int mx3 = Integer.MIN_VALUE ;
        
        for(int i : arr){
            if(i<min1)
            {
                min3 = min2 ;
                min2 = min1 ;
                min1 = i ; 
            }
           else if(i<min2){
               min3  = min2 ;
               min2  = i ;
           }
           else if(i<min3)
           min3 = i ;

            if(i>mx1){
                 mx3 = mx2 ;
                mx2 = mx1 ;
                mx1 = i ; 
            }
            else if(i>mx2){
                mx3 = mx2 ;
                mx2 = i ;
            }
            else if(i>mx3)
            mx3 = i ;
        }
        
       
       int ans = Math.max(mx1*min1*min2,Math.max(mx1*mx2*mx3,min1*min2*min3)) ; 
      
        return ans ;
    }
}
