class Solution {
    public boolean isVowel(char c){
        if(c=='a' || c== 'e' || c== 'i' || c== 'o' || c== 'u')
            return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i=0;
        int count = 0;
        for(;i<k;i++){  
            if(isVowel(s.charAt(i)))
                count++;
        }
        int ans = count;
        for(;i<n;i++){  
            if(isVowel(s.charAt(i)))  
                count++;
            if(isVowel(s.charAt(i-k)))  
                count--;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
