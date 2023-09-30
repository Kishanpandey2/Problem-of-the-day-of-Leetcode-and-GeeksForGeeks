// Method 1 

class Solution {
    public boolean find132pattern(int[] nums) {
        int min = nums[0] ;

        for(int j = 1;j<nums.length -1 ;j++){
            for(int k = j+1;k<nums.length;k++){
                if(nums[k]>min && nums[k]<nums[j])return true ;
            }
            min = Math.min(min,nums[j]) ;
        }

        return false;
    }
    
}

// Method 2 using Stack
class Solution {
    public boolean find132pattern(int[] nums) {
        int []min = new int[nums.length ] ;
        min[0] = nums[0] ;
        for(int i = 1;i<nums.length ;i++)
        min[i] = Math.min(nums[i],min[i-1]) ;

        Stack<Integer>st = new Stack<>()  ;

        for(int j = nums.length - 1;j>=0 ;j--){
            if(nums[j]>min[j])
            {
                while(!st.isEmpty() && st.peek() <= min[j]) st.pop() ;

                if(!st.isEmpty() && st.peek() < nums[j] )return true ;

                st.push(nums[j]) ;
            }


        }

        return false;
    }
}
