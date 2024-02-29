// Brute force solution 

class Solution {
    long sumBitDifferences(int[] arr, int n) {
        long ans = 0 ;
        
        for(int i = 0 ;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                int val = arr[i]^arr[j] ;
                ans += cntBit(val);
            }
        }
        return ans*2;
    }
    int cntBit(int n){
        int cnt = 0 ;
        
        while(n>0)
        {
            cnt++ ;
            n = n&(n-1);
        }
        return cnt ;
    }
}






// Efficient solution

class Solution {
    long sumBitDifferences(int[] arr, int n) {
        long ans = 0 ;
        for(int i = 0;i<32;i++)
        {
            long cntOn = 0 ;
            
            for(int no : arr)
            {
                if((no&(1<<i)) !=0)cntOn++;
            }
            
           
            ans += (cntOn*(n-cntOn)*2) ;
        }
        
        return ans;
    }
}
