
class Solution {

    public boolean isPathCrossing(String path) {
        Set<String>st = new HashSet<>( ) ;

        int i = 0 , j  = 0 ;
        st.add(0+","+0) ;

        for(char ch : path.toCharArray()){
            if(ch == 'E')
            i++ ;
            else if(ch == 'W')i-- ;
            else if(ch =='N')j++ ;
            else if(ch == 'S')
            j-- ;

            String co = i+","+j ;
            if(st.contains(co) ) return true ;

            st.add(co) ;
        }

        return false;
    }
}
