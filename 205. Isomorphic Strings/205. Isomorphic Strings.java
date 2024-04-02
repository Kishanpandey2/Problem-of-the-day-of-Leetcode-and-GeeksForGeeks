class Solution {
    public boolean isIsomorphic(String s, String t) {
        int indS[] = new int[256];
        int []indT = new int[256] ;

        for(int i = 0 ;i<s.length() ;i++)
        {
            if(indS[s.charAt(i)]!= indT[t.charAt(i)])return false;

            indS[s.charAt(i)] = i+1;
            indT[t.charAt(i)] = i+1;
        }
        return true;
    }
}
