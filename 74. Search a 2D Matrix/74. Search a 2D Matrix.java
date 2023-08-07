class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int ar[]  = new int[matrix.length * matrix[0].length] ;
            int c = 0 ;
         for(int no[] : matrix)
         {
             for(int i : no)
             ar[c++] = i ;
         }

         return helper(ar,target);
    }
    private boolean helper(int []ar,int target )
    {
        int low =  0 , high = ar.length-1 ;

        while(low<= high)
        {
            int mid  = low+(high - low)/2 ;

            if(ar[mid]==target)
            return true;
            else if(ar[mid]<target)
            low = mid+1 ;
            else
            high = mid-1 ;
        }
        return false;
    }
}
