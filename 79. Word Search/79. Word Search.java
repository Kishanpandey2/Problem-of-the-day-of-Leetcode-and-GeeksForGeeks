class Solution {
    int []di = {0,-1,0,1};
    int []dj = {-1,0,1,0};
    boolean help(char [][]board,int i,int j ,int ind ,String word){
        if(ind == word.length()) return true;

        if(i<0 || j<0 || i>=board.length || j>= board[0].length)return false;

        if(word.charAt(ind) != board[i][j])return false;

        char myChar = board[i][j] ;
        board[i][j] = '#' ;
        for(int d = 0 ;d<4;d++)
        {
            boolean ans = help(board,i+di[d],j+dj[d],ind+1,word) ;

            if(ans){
                board[i][j] = myChar ;
                return true;
            }

        }

        board[i][j] = myChar ;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        for(int i = 0 ;i<board.length;i++)
        {
            for(int j = 0;j<board[0].length;j++){
                 if(board[i][j]!=word.charAt(0))continue;
                 
            boolean ans = help(board,i,j,0,word);

            if(ans)return true;
            }
           
        }
        return false;
    }
}
