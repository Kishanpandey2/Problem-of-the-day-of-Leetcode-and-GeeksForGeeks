class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ind = 0 ;
        if(arr.length == 0 )
        return 0;
        int l = 0 , h = arr.length - 1;
        while(l<= h){
            int m = (l+h)/2 ;
            if(m != 0 && arr[m-1]<arr[m])
            {
                ind = m ;
                l = m+1 ;
            }
            else if(m == 0 ) l = m+1 ;
            else
            h = m-1;
        }
        return ind ;
    }
}
