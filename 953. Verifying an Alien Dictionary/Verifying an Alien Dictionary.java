class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer>map = new HashMap<>() ;
        for(int i = 0 ;i<order.length() ;i++){
            map.put(order.charAt(i),i+1) ;
        }
        for(int i = 0 ;i<words.length-1;i++){
            String first = words[i] ;
            String second = words[i+1];
            if(!solve(first,second,map))
            return false ;
        }
        return true ;
    }
    private boolean solve(String str1,String str2,Map<Character,Integer>map){
        int i = 0 ,j = 0 ;
        while(i<str1.length() && j<str2.length()){
           if(str1.charAt(i)!=str2.charAt(j)){
            if(map.get(str1.charAt(i))<map.get(str2.charAt(j)))
            return true ;
            else
            return false ;
        }
            i++ ; j++ ;
        }
        if(str1.length()>str2.length())
        return false;
        return true ;
    }
}
