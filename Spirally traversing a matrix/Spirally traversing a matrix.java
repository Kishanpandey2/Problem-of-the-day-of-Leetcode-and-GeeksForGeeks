
class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
         int top = 0  ,left = 0 , right = mat[0].length-1, bottom = mat.length-1 ;
         ArrayList<Integer>ans = new ArrayList<>() ;
         
         
         while(top<= bottom && left <= right){
             // print top row
             for(int i = left;i<=right;i++)
             ans.add(mat[top][i]);
             
             top++ ;
             
             // print right col
             for(int i = top ;i<=bottom;i++)
             ans.add(mat[i][right]);
             
             right-- ;
             
             // bottom row
             if(top<=bottom){
             for(int i = right;i>=left;i--)
             ans.add(mat[bottom][i]);
             }
             bottom-- ;
             
             // left col
             if(left<=right){
             for(int i = bottom ;i>=top;i--)
             ans.add(mat[i][left]);
             }
             left++;
             
         }
         
         return ans;
    }
}
