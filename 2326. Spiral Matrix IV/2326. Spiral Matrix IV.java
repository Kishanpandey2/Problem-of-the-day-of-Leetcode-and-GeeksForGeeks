class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int top = 0 , bottom = m-1, left = 0, right = n-1 ;
        int [][]ans = new int[m][n];

        for(int []i:ans)
        Arrays.fill(i,-1);

        
        while(top<= bottom && left <= right){
            
            for(int i = left ;i<= right;i++)
           {if(head == null)return ans;
             ans[top][i] = head.val ;
           head = head.next;}
            top++;

            for(int i = top ;i<=bottom;i++)
           { if(head == null)return ans;
           ans[i][right] =  head.val ;
           head = head.next;}
            right--;

            if(left<= right)
            {
                for(int i = right;i>=left;i--)
               { if(head == null)return ans;
               ans[bottom][i] = head.val ;
           head = head.next;}

                bottom--;
            }
             if(bottom>=top)
             {
                for(int i = bottom;i>=top;i--)
                {if(head == null)return ans;
                ans[i][left] = head.val ;
           head = head.next;}

                left++;
             }
        }

        return ans;
    }
}
