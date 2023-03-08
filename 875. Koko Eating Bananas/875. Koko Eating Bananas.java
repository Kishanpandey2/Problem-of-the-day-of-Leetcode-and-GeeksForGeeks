class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE  ;
        for(int i : piles){
            max = Math.max(max,i) ;
        }

        int low = 0  ; 
        int high = max ;
        int speed = 0 ;
        while(low<=high){
            int mid = (high-low)/2 + low ;
            if(mid!=0 &&isPossible(piles,h,mid))
            {
                speed = mid ;
                high = mid-1 ;
            }
            else
            low = mid +1 ;
        }
        return speed;
    }
    boolean isPossible(int []piles ,int h, int mid){
        int sum = 0 ;
        for(int i :piles){
            if( i%mid==0)
            sum += i/mid ;
            else
            sum += (i/mid + 1) ;
        }
        if(sum<=h)
        return true ;
        return false ;
    }
}
