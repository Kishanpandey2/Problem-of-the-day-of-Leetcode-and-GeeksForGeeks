class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,List<Integer>>map = new HashMap<>() ;

        for(int i[] : adjacentPairs)
        {
            List<Integer>list = map.getOrDefault(i[0],new ArrayList<>()) ;
            list.add(i[1]) ;
            map.put(i[0],list) ;
           
           list = map.getOrDefault(i[1],new ArrayList<>()) ;
            list.add(i[0]) ;
            map.put(i[1],list) ;
        }


        int []res = new int[adjacentPairs.length+1];

        int k = 0;

        Set<Integer>vis = new HashSet<>() ;
        Stack<Integer>st = new Stack<>() ;


        for(Map.Entry<Integer,List<Integer>> entry :map.entrySet()){
            if(entry.getValue().size() ==1)
            {
                st.add(entry.getKey()) ;
                break;
            }
        }

        while(!st.isEmpty())
        {
            int cur = st.pop() ;
            res[k++] = cur ;
            vis.add(cur);
            for(int nei : map.get(cur))
            {
                if(!vis.contains(nei))
                st.add(nei);
            }
        }

        return res;
    }
}
