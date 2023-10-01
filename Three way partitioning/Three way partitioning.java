
class Solution{
    public void threeWayPartition(int array[], int a, int b)
    {
        int i = 0 , mid = 0 , j = array.length - 1 ;
        
        while(mid <= j){
            if(array[mid]<a)
            {
                swap(array,mid,i) ;
                i++ ;
                mid++ ;
            }
            else if(array[mid] > b)
            {
                swap(array,mid,j) ;
                j-- ;
            }
            else
            mid++ ;
        }
    }
    
    void swap(int []array,int i,int j){
        int t = array[i] ;
        array[i] = array[j] ;
        array[j] = t;
    }
}
