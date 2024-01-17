class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>map = new HashMap<>() ;

        for(int i : arr)
        map.put(i,map.getOrDefault(i,0)+1) ;

        Set<Integer>st = new HashSet<>() ;

        for(Integer i : map.values())
        if(st.size()>0 && st.contains(i))
        return false;
        else st.add(i) ;

        return st.size() == map.size();
    }
}
