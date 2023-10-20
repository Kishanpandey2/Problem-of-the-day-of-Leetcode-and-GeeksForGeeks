class Solution {
    static int isPossible(int N, int arr[]) {
        long sum = 0 ;
        for(int i : arr)
        sum += i ;
        
        return (sum%3==0) ? 1 : 0 ;
    }
}
