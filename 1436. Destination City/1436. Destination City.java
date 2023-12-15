class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String>st = new HashSet<>() ;

        for(int i = 0 ;i<paths.size() ;i++){
            st.add(paths.get(i).get(0)) ;
        }

        for(int i = 0 ;i<paths.size() ;i++){
            if(!st.contains(paths.get(i).get(1)))
            return (paths.get(i).get(1));
        }

           
        return "";
    }
}
