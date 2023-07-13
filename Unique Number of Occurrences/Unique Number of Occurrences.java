class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        Map<Integer,Integer>map = new HashMap<>() ;
        for(int i : arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Integer>st = new HashSet<>() ;
        for(Integer i : map.values())
        {
            st.add(i) ;
        }
        return (st.size()== map.size())?true:false;
    }
}
       
