
class Solution
{
    public int[] singleNumber(int[] nums)
    {
          int xor = 0 ;
          for(int i : nums)
          xor^= i ;
          
          int ans[] = new int[2];
          int mask = xor &( ~( xor-1)) ;
          
          int a = 0 , b = 0 ;
          for(int i : nums)
          {
              if((mask & i) !=0)
              a ^= i ;
              else
              b^=i ;
          }
          
          if(a>=b)
          {ans[0] =  b ;
         ans[1] = a ;
          }
          else
          {
              ans[0] =  a ;
         ans[1] = b;
          }
          
          return ans;
    }
}
