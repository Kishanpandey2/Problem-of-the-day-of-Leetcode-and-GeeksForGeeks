class Solution {
    static int minRepeats(String A, String B) {
        int count = 1 ;
        StringBuilder rep = new StringBuilder(A) ;
        while(rep.length()<B.length()){
            rep.append(A) ;
            count++ ;
        }
        String s = rep.toString() ;
        if(s.contains(B))
        return count ;
        s+=A ;
        if(s.contains(B))
        return count+1 ;
        return -1 ;
    }
};
