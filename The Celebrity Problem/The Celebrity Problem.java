// method -1

class Solution {
    
    public int celebrity(int mat[][]) {
        int top = 0 , down = mat.length-1 ;
        
        while(top<down)
        {
            if(mat[top][down]==1)
            top++;
            else if(mat[down][top] ==1)
            down--;
            else
            {
                top++;
                down--;
            }
        }
        
        if(top>down)return -1 ;
        
        for(int i = 0 ;i<mat.length;i++)
        {
            if(mat[top][i] != 0 ||( mat[i][top]!= 1 && top != i))return -1;
            
        }
        
        return top ;
    }
}






// Method -2
class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
         int freq[] = new int[mat.length] ;
          int []f =  new int[mat.length] ;
          for(int i= 0;i<mat.length;i++)
          {
              for(int j= 0 ;j<mat[0].length;j++)
              {
                  if(mat[i][j]==1 && i!=j)
                 { freq[j]++;
                     f[i]++;
                 }
              }
          }
          
          for(int i = 0;i<freq.length;i++)
          {
              if(freq[i]==freq.length-1 && f[i]==0)return i ;
          }
          
          return -1;
    }
}
