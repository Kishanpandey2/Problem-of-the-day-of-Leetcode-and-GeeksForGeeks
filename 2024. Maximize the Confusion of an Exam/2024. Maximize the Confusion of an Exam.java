class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char []ch = answerKey.toCharArray() ;
        return Math.max(slindingWindow(ch,k,'T'),slindingWindow(ch,k,'F'));
    }
    int slindingWindow(char ch[] , int k,char target){
        int i = 0 ,  j  = 0 , cnt = 0 ;
        int ans =0;
        
        while(j<ch.length){
            if(ch[j] == target)
            cnt++;

            while(cnt>k)
            {
                if(ch[i] == target)
                cnt--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
