class Solution {
    int minOperation(String s) {
        int len = s.length() ;
        int low = 0 , high = len ;
        if(len==1)
        return 1 ;
        while(low<=high)
        {
            int mid = low+high/2 -1 ;
            if((s.substring(0,mid+1)).equals(s.substring(mid+1,2*(mid+1))))
            return (mid+1+1+(len-2*(mid+1))) ;
            high--;
        }
        return len ;
    }
}
