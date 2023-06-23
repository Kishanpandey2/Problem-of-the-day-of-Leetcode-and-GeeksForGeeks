
class Solution {
    static int leastInterval(int N, int k, char tasks[]) {
        // code here
        
        int[] counter = new int[26];
        int maxF = 0; // max_freq
        int maxFc = 0; // no of ch having max_freq
        for (char task : tasks) {
            counter[task - 'A']++;
        }
        for (int x : counter)
        {
            if(maxF==x)
            {
                 maxFc++;
            }
            if(maxF<x)
            {
                maxF=x;
                maxFc=1;
            }
        }
        
      
        int gaps = maxF-1;
         
        int gaps_len = k - (maxFc - 1);
        
       
        int avail_slot = gaps * gaps_len;
        
        int avail_task = N - maxF * maxFc;
        
     
        int idles = Math.max(0, avail_slot - avail_task);
        
        return N+idles;
    }
}
