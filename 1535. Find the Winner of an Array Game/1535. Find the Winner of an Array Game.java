class Solution {
    public int getWinner(int[] arr, int k) {
            int winner = arr[0] ;
            int cnt = 0 ;

            for(int i = 1;i<arr.length;i++)
            {
                if(winner > arr[i])cnt++;
                else
                {
                    winner = arr[i] ;
                    cnt = 1;
                }

                if(cnt == k)return winner;
            }

            return winner;
    }
}
