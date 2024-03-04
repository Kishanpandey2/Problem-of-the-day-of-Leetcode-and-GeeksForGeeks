
class Solution
{
    public void swapElements(int[] arr, int n)
    {
        if(n<3)return ;
        
        for(int i = 0 ;i<n-2;i++)
        {
            swap(arr,i,i+2);
        }
       
    }
    public void swap(int []a,int i,int j){
        int t = a[i] ;
        a[i] = a[j] ;
        a[j]= t;
    }
}
