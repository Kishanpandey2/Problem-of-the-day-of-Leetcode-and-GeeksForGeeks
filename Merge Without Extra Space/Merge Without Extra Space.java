// Brute force solution  method 1

class Solution
{
   
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
      long []arr3 = new long[n+m] ;
     int  k=0 ;
        for(long i : arr1)
       arr3[k++] = i;
        
         for(long i : arr2)
        arr3[k++] = i;
        
        Arrays.sort(arr3);
        for(int i = 0 ;i<n;i++)
        arr1[i] =arr3[i];
        for(int i = 0 ;i<m;i++)
        arr2[i] =arr3[n+i];
    }
}

// Efficient solution method 2

class Solution
{
   
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
      long []arr3 = new long[n+m] ;
     int  k=0 ,i = 0 , j = 0 ;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            arr3[k++] = arr1[i++];
            else
             arr3[k++] = arr2[j++];
        }
         while(i<n)
         arr3[k++] = arr1[i++];
        while(j<m)
         arr3[k++] = arr2[j++];
        
        for( i = 0 ;i<n;i++)
        arr1[i] =arr3[i];
        for( i = 0 ;i<m;i++)
        arr2[i] =arr3[n+i];
    }
}

// Efficient solutionn with O(1) space
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i =  n-1 , j = 0 ;
        while(i>=0 && j<m)
        {
            if(arr1[i]<=arr2[j])
            break;
            else
            {
                long temp = arr1[i] ;
                arr1[i] = arr2[j] ;
                arr2[j] = temp ;
                j++ ; i-- ;
            }
        }
        Arrays.sort(arr1) ;
        Arrays.sort(arr2);
    }
}
