class Solution {
    public int findKthPositive(int[] arr, int k) {
        int []nos = new int[100001] ;
        for(int i = 1  ;i<=100000 ;i++)
        {
            nos[i] = i ;
        }
        for(int i : arr)
        {
            nos[i]= 0  ;
        }
        int c = 0 ;
        for(int i = 1  ;i<=100000 ;i++)
        {
           

            if(nos[i]!=0)
            c++; 
            if(c==k)
            return nos[i] ;
        }
        return 0;
    }
}
