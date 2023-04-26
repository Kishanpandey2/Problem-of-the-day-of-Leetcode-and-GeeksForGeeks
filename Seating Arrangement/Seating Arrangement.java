
class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        int res = 0  ;
        int i = 0 ;
        while(i<m){
            int l = (i==0)?0:seats[i-1] ;
            int r =  (i == m-1)?0:seats[i+1] ;
            if(seats[i] == 0 &&( l+r ==0))
            {
                res++ ;
                i+=2 ;
            }
            else
            i++;
        }
        return res>=n; 
    }
}
