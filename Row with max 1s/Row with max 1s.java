
class Solution {
    public int rowWithMax1s(int arr[][]) {
        int cnt = 0 ;
        int mxOne = 0;
        int ans= -1;
        
        for(int i = 0 ;i<arr.length;i++){
            int mid = binarySearch(arr[i],0,arr[i].length-1);
            cnt= 0;
            cnt+= (arr[i].length - mid);
            
            if(cnt>mxOne )
            {
                mxOne = cnt; 
                ans = i;
            }
            
        }
        
        return ans;
    }
    int binarySearch(int []ar,int i,int j){
        int ans = ar.length;
        while(i<=j){
            int mid = (i+j)/2 ;
            if(ar[mid ]>=1){
                ans = mid ;
                j = mid-1;
            }
            else 
            {
               i = mid+1;
            }
        }
        
        return ans;
    }
}
