class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>() ;
        List<List<Integer>>ans = new ArrayList<>() ;
        for(int i : nums)
        map.put(i,map.getOrDefault(i,0)+1) ;

        while(map.size()>0){
            List<Integer>temp = new ArrayList<>() ;
            for(Integer i : map.keySet())
            {
                temp.add(i) ;
            }

            for(int i = 0 ;i<temp.size();i++)
            {
                 if(map.get(temp.get(i))==1)
                map.remove(temp.get(i)) ;
                else
                map.put(temp.get(i),map.get(temp.get(i))-1) ;
            }
            ans.add(temp);
        }

        return ans;
    }
}
