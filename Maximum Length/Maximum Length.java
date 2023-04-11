class Solution {
    int solve(int a, int b, int c) {
         
        char prev = '0';
        int freq[] = {a, b, c};

        StringBuilder ans = new StringBuilder("");

        while (true) {
            int ma = 0;
            char cur = ' ';

            for (int i = 0; i < 3; i++)
                if (prev != (char)(i + 'a') && ma < freq[i]){
                    ma = freq[i];
                    cur = (char)(i + 'a');
                    
                }

            if (ma == 0) 
                break;

            ans.append(String.valueOf(cur));
            freq[cur - 'a']--;
            
            if (ma >= 2 && (prev == '0' || ma > freq[prev - 'a'])) 
            {
                ans.append(String.valueOf(cur));
                freq[cur - 'a']--;
            }
            prev = cur;
             
              
        }
        int n=ans.length();
        if(n!=a+b+c) return -1;
        return n;
    }
};
