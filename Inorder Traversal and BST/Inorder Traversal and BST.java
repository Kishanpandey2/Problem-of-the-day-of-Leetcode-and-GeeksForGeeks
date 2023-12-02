class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
       int temp = arr[0] ;
       
       for(int i = 1 ;i<N;i++)
       {
           if(temp>arr[i])
           return 0 ;
           
           temp = arr[i] ;
       }
       return 1;
    }
}
