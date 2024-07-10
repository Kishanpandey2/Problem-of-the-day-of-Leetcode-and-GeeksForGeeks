class Solution {
    public int minOperations(String[] logs) {
        int ans = 0 ;

        for(String s : logs){
            if(s.equals("../") )
            {
                if(ans == 0 )
                {

                }
                else
                ans--;
            }
            else if(s.equals("./"))
            {

            }
            else
            ans++;
        }

        return ans;
    }
}
