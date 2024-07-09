class Solution {
    public double averageWaitingTime(int[][] cus) {
            int st = 1 ;
            double sum = 0 ;
        for(int i = 0 ;i<cus.length;i++)
        {
            if(cus[i][0]>st)
            st = cus[i][0];
            
            st += cus[i][1];

            sum += (st-cus[i][0]);
        }

        return (double)sum / cus.length;
    }
}
