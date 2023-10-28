class Solution {
    Map<String,Long>map = new HashMap<>()  ;
    private int mod = 1000000007 ;
    public int countVowelPermutation(int n) {
        char []ch = new char[]{'a','e','i','o','u'} ;

        long total = 0 ;
        for(char c : ch){
            total  = (total + help(n-1,c))%mod ; 
        }

        return (int)total ;
    }

        private  long help(int remaining , char prevChar){
            if(remaining == 0)return 1 ;
            String key = "" + remaining + prevChar  ;

            if(map.containsKey(key))return map.get(key) ;

            long total = 0 ;

            switch(prevChar ){
                case 'a' : total =  (help(remaining -1, 'e'))%mod ;
                break ;
                case 'e' : total =  (help(remaining -1, 'a') +help(remaining -1, 'i')  )%mod ;
                break ;
                case 'i': total = (help(remaining -1, 'a') +help(remaining -1, 'e') + help(remaining -1, 'o') +help(remaining -1, 'u') )%mod ;
                break ;
                case 'o':total = (help(remaining -1, 'u') +help(remaining -1, 'i')  )%mod ;
                break ;
                case 'u':total =  (help(remaining -1, 'a'))%mod ;
                break ;
            }

            map.put(key,total) ;

            return total;
        }
}
