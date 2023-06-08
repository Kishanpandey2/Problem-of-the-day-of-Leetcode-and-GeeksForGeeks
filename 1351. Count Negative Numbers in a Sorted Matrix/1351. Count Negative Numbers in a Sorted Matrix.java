class Solution {
    public int countNegatives(int[][] grid) {
        int cnt =  0 ;
        for(int []i :grid)
        {
            for(int n = 0 ;n<i.length ;n++)
            if(i[n]<0)
            cnt++;
        }
        return cnt;
    }
}
