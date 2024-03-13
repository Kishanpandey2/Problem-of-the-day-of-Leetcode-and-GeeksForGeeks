class Solution {
    public int pivotInteger(int n) {
        int sum = 0 ;

        for(int i = 1;i<=n;i++)
        sum += i ;

        int temp = 0 ;

        for(int i = 1;i<=n;i++)
        {
            

            temp += i-1 ;
            sum -= i;
            
            if(temp == sum )return i  ;
        }

        return -1;
    }
}
