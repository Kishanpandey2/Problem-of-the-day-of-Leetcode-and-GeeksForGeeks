class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xdif = Math.abs(fx - sx) , ydif = Math.abs( fy-sy) ;

        if(xdif == 0 && ydif==0 && t ==1)return false;

        return (Math.min(xdif,ydif)+Math.abs(xdif-ydif))<=t ;
    }
}
