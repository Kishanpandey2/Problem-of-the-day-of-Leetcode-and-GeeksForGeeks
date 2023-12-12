class Solution {
    public int maxProduct(int[] nums) {
       int mx1 = Integer.MIN_VALUE ;    
       int mx2 = Integer.MIN_VALUE ;    

       for(int i : nums){
          if(i>=mx1)
          {
              mx2 = mx1 ;
              mx1 = i  ;
          }
          else if(i>mx2)
        {
            mx2 = i ;
        }

       }

       return (mx1-1)*(mx2-1);
    }
}
