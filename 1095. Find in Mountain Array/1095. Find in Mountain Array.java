/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = binarySearch(mountainArr) ;
        if(mountainArr.get(peak)== target)return peak ;

        int leftInd = binarySearchAgnostic( mountainArr ,target, 0,peak ) ;

        if(leftInd == -1)
        return  binarySearchAgnostic( mountainArr ,target,peak+1 ,mountainArr.length()-1 ) ;

        return leftInd ;

    }
    public int binarySearch(MountainArray mountainArr){
        int ans  = -1 ;

        int low = 0 , high = mountainArr.length() -1 ;

        while(low <= high){
            int mid  = low + ( high - low)/2 ;

            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            low = mid+1 ;
            else
            {
                ans = mid ;
                high = mid-1 ;
            }
        }
        return ans ;
    }

    public int binarySearchAgnostic( MountainArray mountainArr , int target , int start , int end){

        boolean isAsc = mountainArr.get(start)<mountainArr.get(end) ;

        while(start<= end){
            int mid = start + ( end - start) / 2 ;

            if(mountainArr.get(mid)==target)
            return mid ;

            if(isAsc){
                if(target>mountainArr.get(mid))
                start = mid +1 ;
                else 
                end = mid -1 ;

            }
            else
            {
                 if(target>mountainArr.get(mid))
                 end = mid -1 ;
                else 
               start = mid +1 ;
            }
        }

        return -1;
    }
}
