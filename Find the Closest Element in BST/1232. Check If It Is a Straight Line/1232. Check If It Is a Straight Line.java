class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        float slop = get_slop(coordinates[0],coordinates[1]);
        for(int i = 2 ;i<coordinates.length ;i++){
            float m = get_slop(coordinates[i],coordinates[0]);
            if(slop != m)
            return false ;

        }
        return true;
    }
    float get_slop(int[]p1, int []p2){
        if(p1[0] == p2[0] )
        return 100000;

        return (float)(p2[1]-p1[1])/(p2[0]-p1[0]);
    }
}
