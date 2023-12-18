class Solution {
    public int maxProductDifference(int[] nums) {
        int mx1 = 0 , mx2 = 0  ;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for(int i : nums)
        {
            if(i>= mx1)
            {
                mx2 = mx1 ;
                mx1 = i ;
            }
            else if(i>mx2)
            mx2 = i ;


             if(i<= min1)
            {
                min2 = min1 ;
                min1 = i ;
            }
            else if(i<min2)
            min2 = i ;

        }

        System.out.println(mx1+" "+mx2+"\n" + min1+" "+min2+"\n");
        return (mx1*mx2)-(min1*min2);
    }
}
