class Solution {
    int countX(int L, int R, int X) {
        int sum = 0 ;
        
        for(int i = L+1;i<R;i++)
        {
            int rem = 0 ;
            int temp = i ;
            while(temp>0){
                rem =  ( temp%10) ;
                if(rem == X)
                sum++ ;
                temp/=10 ;
            }
        }
        return sum;
    }
};
