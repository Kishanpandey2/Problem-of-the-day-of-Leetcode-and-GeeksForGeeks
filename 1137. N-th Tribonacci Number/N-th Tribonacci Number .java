class Solution {
    public int tribonacci(int n) {
    if(n==0)
    return 0 ;
    else if(n<=2)
    return 1 ;
    else
    {
        int a = 0 ,b = 1, c = 1 ;
        int sum = 0 ;
        int ind = 3 ;
        while(ind<=n){
            sum=a+b+c ;
            a = b ;
            b = c ;
            c = sum ;
            ind++;
        }
        return sum ;
    }
  
    }
}


Time Complexity : O(n) 
