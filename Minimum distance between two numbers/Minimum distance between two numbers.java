
class Solution {
    int minDist(int a[], int n, int x, int y) {
        int min = Integer.MAX_VALUE ;
        int indx = -1 ,indy = -1 ;

        for(int i = 0 ;i<n;i++){
            if(a[i] == x)
            indx = i ;
            
            if(a[i] == y) 
            indy = i ;
            
            if(indx != -1 && indy != -1)
            min = Math.min(min,Math.abs(indx-indy)) ;
        }
        
        return min== Integer.MAX_VALUE ? -1 : min ;
    }
} 
