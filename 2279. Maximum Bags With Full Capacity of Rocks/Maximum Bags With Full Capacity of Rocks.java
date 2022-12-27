class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int res = 0 ;
        int []vacancy = new int[rocks.length] ;
        for(int i =   0 ;i<rocks.length ;i++)
        {
            
          vacancy[i]= capacity[i]-rocks[i] ;  
        }
        Arrays.sort(vacancy);
        for(int i =   0 ;i<rocks.length ;i++)
        {
            if(  additionalRocks>=vacancy[i] )
            {
                additionalRocks -= vacancy[i];
                res++;
            }

        }

        return res ;
    }
}
