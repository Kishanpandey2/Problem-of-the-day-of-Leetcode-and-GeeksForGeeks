
class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer>ans  = new ArrayList<>() ;
        ans.add(firstOcc(arr,x,n-1)) ;
        ans.add(lastOcc(arr,x,n-1)) ;
        
        return ans ;
    }
     int firstOcc(int []arr, int x,int n){
         int res = -1 ;
        int i = 0  , j =  n ;
         while(i<=j){
            int mid = (i+j)/2 ;
             if(arr[mid]>x)
            j = mid -1 ;
            else if(arr[mid]<x)
            i  = mid+1 ;
            else{
                res = mid ;
                j = mid-1 ;
            }
           
        }
        
        return res ;
    }
    
     int lastOcc(int []arr, int x,int n){
         int res = -1 ;
        int i = 0  , j =  n ;
        while(i<=j){
            int mid = (i+j)/2 ;
             if(arr[mid]>x)
            j = mid -1 ;
            else if(arr[mid]<x)
            i  = mid+1 ;
            else{
                res = mid ;
                i = mid+1 ;
            }
           
        }
        
        return res ;
    }
}
