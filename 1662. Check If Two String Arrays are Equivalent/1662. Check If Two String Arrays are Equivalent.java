class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = makeString(word1) ;
        String s2 = makeString(word2) ;
        return s1.equals(s2) ;
    }
    public String makeString(String []word)
    {
        StringBuilder sb = new StringBuilder() ;
        for(String s:word)
            sb.append(s) ;
        return sb.toString() ;
    }
}
