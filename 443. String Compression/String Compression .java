class Solution {
    public int compress(char[] chars) {
        int ind = 0 , i = 0  ;
        while(i<chars.length){
            int j = i ;
            while(j<chars.length  && chars[j]== chars[i])
            j++ ;

            chars[ind++]= chars[i] ;
            if(j-i> 1)
            {
                String count = j-i+"" ;
                for(char ch : count.toCharArray())
                chars[ind++] = ch ;
            }
            i= j ;
        }
        return ind ;
    }
}
