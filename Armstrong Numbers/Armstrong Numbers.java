class Solution {
    static String armstrongNumber(int n) {
        int temp = n ;
        int arm = 0 ;
        
        while(temp>0){
            int digit = temp%10 ;
            
            arm += ( digit * digit * digit) ;
            temp /=10 ;
        }
        
        if(arm == n)return "true";
        
        return "false";
        
    }
}
