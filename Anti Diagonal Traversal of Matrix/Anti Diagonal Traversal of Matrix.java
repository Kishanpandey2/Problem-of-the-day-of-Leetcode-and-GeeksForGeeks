class Solution
{
    public static int[] antiDiagonalPattern(int[][] matrix)
    {
        int i=0;
        int j=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(true){
            while(i< matrix.length) {
                f(al, matrix, i, j);
                i++;
            }
            j++;
            while(j< matrix.length) {
                f(al, matrix, i-1, j);
                j++;
            }
            break;
        }
        int ans[]=new int[al.size()];
        int k=0;
        for(int it:al){
            ans[k++]=it;
        }
        return ans;
    }
    static void f(ArrayList<Integer> al,int [][]matrix,int i,int j){
        while(i>=0&&j< matrix.length){
            al.add(matrix[j][i]);
            i--;
            j++;
        }
   
}}
