
class Solution {
    public static int getMaximum(int n, int[] arr) {
         long sum=0;
        for(int x:arr)
        sum+=x;
        
        while(n>0)
        {
            if(sum%n==0)
            return n;
            
            n--;
        }
        return 0;
    }
}
