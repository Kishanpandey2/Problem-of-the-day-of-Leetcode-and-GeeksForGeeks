class Solution {
    public int minimumLength(String s) {
        int i = 0 , j = s.length()-1;
        int len = s.length();

        while(i<j && s.charAt(i)==s.charAt(j)){
           char ch = s.charAt(i);

           while(i<=j && s.charAt(i)==ch)
           i++;
           while(i<=j && s.charAt(j)==ch)
           j--;
        }

        return i>j?0:j-i+1 ;
    }
}
