class Solution {

   
    int missingNumber(int n, int arr[]) {

       int xor = 0 ;
       
       for(int i =  1;i<=n;i++)xor^=i;
       
       for(int i : arr)
       xor ^= i ;
       
       return xor ;
    }
}
