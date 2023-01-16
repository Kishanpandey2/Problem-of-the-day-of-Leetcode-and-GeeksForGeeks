class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>res = new ArrayList<>() ;
        for(int []in : intervals)
        {
            if(in[1]<newInterval[0])
            res.add(in) ;
            else if(newInterval[1]<in[0])
            {
                res.add(newInterval) ;
                newInterval = in ;
            }
            else
            {
                newInterval[0]= Math.min(in[0],newInterval[0]);
                newInterval[1]= Math.max(in[1],newInterval[1]);
            }
        }
        res.add(newInterval);
      return   res.toArray(new int[res.size()][]) ;
    }
}

Time Complexity : O(n)
