class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int temp_sum  = 0  ;
        int total_sum =  0 ;
        int pos = 0 ;
        for(int i = 0 ;i<gas.length ;i++)
        {
            temp_sum  += (gas[i]- cost[i]) ;
           
            if(temp_sum < 0)
            {
                total_sum += temp_sum  ;
                 temp_sum = 0 ;
                 pos= i+1 ;
            }

        }
        total_sum += temp_sum ;
        return (total_sum>=0)?pos:-1 ;
    }
}
