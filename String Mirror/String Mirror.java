
class Solution {
    public static String stringMirror(String str) {
      
        int k = 0;
        
        if(str.length() == 1 || str.charAt(0) == str.charAt(1))return str.substring(0,1) + str.substring(0,1) ;

        while(k <str.length() -1  && str.charAt(k+1) <= str.charAt(k) ) k++;
        
        String s1 = str.substring(0, k+1);
        String s2 = "";
        
        //reverse
        for(int i = 0; i<s1.length(); i++) s2 = s1.charAt(i) + s2;
        
        return s1+s2;
    }
}
        
