class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalLetter = 0 ;
        for(int i = 0 ;i<word.length();i++)
        {
            char ch = word.charAt(i) ;
            if(ch >=65 && ch<=90)
           ++capitalLetter ;

        }
        if(capitalLetter == word.length() || capitalLetter == 0)
        return true;
        else if(capitalLetter == 1)
        {
            if(word.charAt(0)>=65 && word.charAt(0)<=90)
            return true ;
            else
            return false ;
        }
        else
        return false;
    }
}
