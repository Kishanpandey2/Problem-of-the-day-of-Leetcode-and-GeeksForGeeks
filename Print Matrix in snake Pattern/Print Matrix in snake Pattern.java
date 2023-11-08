
class Solution
{
    
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer>ans = new ArrayList<>();
        int N = matrix.length ;
        for(int i =0 ;i<N;i++){
            if(i%2==0)
            {
                for(int j = 0 ;j<N;j++)
                ans.add(matrix[i][j]);
            }
            else
            {
                for(int j = N-1 ;j>=0;j--)
                ans.add(matrix[i][j]);
            }
        }
        
        return ans;
    }
}
