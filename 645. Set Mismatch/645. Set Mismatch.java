class Solution {
    public int[] findErrorNums(int[] nums) {
        int []freq = new int[nums.length+1] ;

        for(int i : nums)
        freq[i]++ ;

        int []ans = new int[2] ;

        boolean flag =true ;
        int ind = 0 ;

        for(int i : nums)
        if(freq[i]==2)
        {ans[ind++] = i ;break; }

          for(int i  = 1;i<=nums.length;i++)
          if(freq[i] == 0)
          ans[ind] = i ;

        return ans;
    }
}
