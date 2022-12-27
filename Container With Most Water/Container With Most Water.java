class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        int i = 0 ,j = len-1 ;
        int mxar = 0 ;
        int width  = 0 , hght = 0 ;
        while(i<=j)
        {
            if(A[i]<A[j])
            {
            width = j-i ;
            hght = Math.min(A[i],A[j]);
            i++;
            }
            else
            {
                width = j-i ;
            hght = Math.min(A[i],A[j]);
            j--; 
            }
            int t = width * hght ;
            if(t>mxar)
            mxar = t ;
        }
        return mxar;
        
    }
    
}

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
