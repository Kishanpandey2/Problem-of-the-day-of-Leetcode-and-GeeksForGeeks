class Solution {
    public int findTheWinner(int n, int k) {
        int ind = help(n,k);
        return ind+1;
    }

    int help(int n,int k){
          if(n == 1)return 0;

        return (help(n-1,k)+k)%n;
    }
}
