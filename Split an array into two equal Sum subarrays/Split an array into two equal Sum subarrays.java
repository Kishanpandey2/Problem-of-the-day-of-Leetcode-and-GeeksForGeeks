
class Solution {
    public boolean canSplit(int arr[]) {
        
            if(arr.length ==1)return false ;
            
            int sum = 0 ;
            
            
            for(int i : arr)
            sum += i ;
            
            int preSum = 0 ;
 
          for(int i : arr){
                 preSum += i;
                sum -=  i;
                
                if(preSum == sum )return true;
            }
             
             
             return false;
    }
}
