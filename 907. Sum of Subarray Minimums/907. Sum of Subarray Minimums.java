class  Pair{
    int element ;
    int noMin;

    Pair(int element , int noMin){
        this.element = element ;
        this.noMin = noMin ;
    }
}
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int left[] = new int[arr.length] ;
        int right[] = new int[arr.length] ;

        Stack<Pair>st1 = new Stack<>();
        Stack<Pair>st2 = new Stack<>();

        for(int i = 0 ;i<arr.length;i++)
        {
            int curElement = arr[i] ;
            int cnt = 1;
            while(!st1.isEmpty() && st1.peek().element > curElement) {
                cnt += st1.peek().noMin ;
                st1.pop();
            }
            st1.push(new Pair(curElement,cnt));
            left[i] = cnt ;
            
        }

        for(int i = arr.length-1 ;i>=0;i--)
        {
            int curElement = arr[i] ;
            int cnt = 1;
            while(!st2.isEmpty() && st2.peek().element >= curElement) {
                cnt += st2.peek().noMin ;
                st2.pop();
            }
            st2.push(new Pair(curElement,cnt));
            right[i] = cnt ;
            
        }

       int mod = (int) 1e9 + 7;
        long answer = 0;
      
        for (int i = 0; i < arr.length; ++i) {
            answer += (long) ( left[i]) * (right[i] ) % mod * arr[i] % mod;
            answer %= mod;
        }
      
        return (int) answer;
       
    }
}
