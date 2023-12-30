class Solution {
    public boolean makeEqual(String[] words) {
        int []count = new int[26] ;

        for(String word : words){
            for(int i = 0 ;i<word.length() ;i++)
            count[word.charAt(i)-'a']++ ;
        }

        int len  = words.length ;

        for(int i = 0;i<26;i++)
        if(count[i]%len !=0)return false ;

        return true;
    }
}
