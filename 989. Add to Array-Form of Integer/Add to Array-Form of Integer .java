class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer>ans = new ArrayList<>() ;
       int carray  = k ;
       int i = num.length-1 ;
       while(i>=0 || carray>0)
       {
           if(i>=0 )
           carray += num[i] ;
           ans.add(carray%10) ;
           carray/=10 ;
           i-- ;
       }
        Collections.reverse(ans) ;
        return ans ;
    }
}
