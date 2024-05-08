class Solution {
    public String[] findRelativeRanks(int[] score) {
     int [][]sortScore = new int[score.length][2];

     for(int i = 0 ;i<score.length;i++)
     sortScore[i] = new int[]{i,score[i]};

     Arrays.sort(sortScore, (x,y) -> (y[1] -x[1]));

     String[] res = new String[score.length];

     for(int i = 0 ;i<score.length;i++)
     {
        if(i == 0 )
        res[sortScore[i][0]] = "Gold Medal";
        else if(i == 1)
        res[sortScore[i][0]] = "Silver Medal";
        else if(i == 2)
        res[sortScore[i][0]] = "Bronze Medal";
        else
        res[sortScore[i][0]] = String.valueOf(i+1) ;
     }   

     return res;
    }
}
