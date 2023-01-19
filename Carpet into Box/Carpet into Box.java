class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int length = A ;
        int breadth = B ;
        int count =0 ;
        while(length > C || breadth > D)
        {
            if(length>C)
            {
                count++ ;
                length/=2 ;
            }
             if(breadth>D)
            {
                count++ ;
                breadth/=2 ;
            }
        }
        int previousAns = count  ;
        length = B ;
        breadth = A ;
        count = 0 ;
        while(length > C || breadth > D)
        {
            if(length>C)
            {
                count++ ;
                length/=2 ;
            }
             if(breadth>D)
            {
                count++ ;
                breadth/=2 ;
            }
        }
        return Math.min(previousAns,count) ;
    }
   
}

Expected Time Complexity: O( max( log(a), log(b) ) ) .
Expected Auxiliary Space: O(1) .
