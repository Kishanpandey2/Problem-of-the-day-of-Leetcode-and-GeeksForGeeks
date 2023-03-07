class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1 ;

        long min = time[0] ;
        for(int t:time){
            min = Math.min(min, t) ;
        }

        long right = totalTrips*min ;
        while(left<right){
            long mid = (right - left)/2 + left ;

            long total= totalTripInGivenTime(time,mid) ;

            if(total < totalTrips)
          left = mid+1 ;

            else
              right = mid ;

        }
        return left;
    }

    long totalTripInGivenTime(int []time , long givenTime){
        long totalTrip = 0l ;

        for(int t:time){

            totalTrip += ((long)givenTime/t)  ;
        }
        return totalTrip ;
    }
}
