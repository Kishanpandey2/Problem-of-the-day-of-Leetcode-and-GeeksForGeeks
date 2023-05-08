 

class Solution{
    int modulo(String s, int m) {
 
        int p = 0;
        for(int i=0; i<s.length(); i++) {
            p = (p*2 + (s.charAt(i)-'0')) % m;
        }
        return p;
    }
}
