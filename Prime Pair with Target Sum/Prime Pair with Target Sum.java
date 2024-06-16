
class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        int low = 2 ;
        ArrayList<Integer>ans  = new ArrayList<>() ;
        
        
        while(low<n)
        {
            if(prime(low) && prime(n-low))
            {
                ans.add(low);
                ans.add(n-low);
                break;
            }
            low++;
        }
        
        if(ans.size() ==0)
        {
            ans.add(-1); ans.add(-1);
        }
        return ans;
    }
    static boolean prime(int n){
        if(n ==2)return true ;
        
        for(int i = 2;i*i<=n;i++)
        if((n%i) == 0)return false;
        
        return true;
    }
}
