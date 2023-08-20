// Brute Force or Naive solution 


class Solution {
    int count(int[] arr, int n, int x) {
         int cnt  =0  ;
         for(int i : arr)
         if(i == x)
         cnt++ ;
         
         return cnt ;
    }
}


// Efficient solution using binary search


class Solution {
    int firstOcc(int  []arr,int x)
    {
        int l = 0 , h = arr.length-1  ;
        while(l<=h)
        {
            int  m = l+ ( h  - l)/2 ;
            if(arr[m]>x)
            h = m -1 ;
            else if(arr[m]<x)
            l =  m +1 ;
            else
            {
                if(m == 0 || arr[m-1]!=x)
                return m ;
                else
                h = m-1;
            }
        }
        return -1;
    }
    
    int lastOcc(int  []arr,int x)
    {
        int l = 0 , h = arr.length-1  ;
        while(l<=h)
        {
            int  m = l+ ( h  - l)/2 ;
            if(arr[m]>x)
            h = m -1 ;
            else if(arr[m]<x)
            l = m  +1 ;
            else
            {
                if(m == arr.length-1 || arr[m+1]!=x)
                return m ;
                else
                l = m+1;
            }
        }
        return -1;
    }
    int count(int[] arr, int n, int x) {
         int f = firstOcc(arr,x) ;
         int l = lastOcc(arr,x) ;
         
     
         if( f == -1 || l == -1)
         return 0;
         return l - f+1 ;
    }
}
