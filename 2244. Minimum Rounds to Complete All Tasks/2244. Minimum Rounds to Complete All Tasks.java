class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i : tasks)
        {
            map.put(i,map.getOrDefault(i,0)+1);

        }
        int ans =  0;
        for(Integer n : map.values())
        {
            if(n<2)
            return -1 ;
            int t = 0 ;
            while(n>=3)
            {
                t++;
                n-=3;
            }
            if(n!=0)
            t++;
            ans+=t ;
        }
            return ans ;
    }
}


