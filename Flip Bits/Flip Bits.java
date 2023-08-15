
class Solution {

    public static int maxOnes(int a[], int n) {
        int cnt = 0 ;
        for(int i= 0 ;i<n;i++)
        {
            if(a[i]==1)
            {
                cnt++ ;
                a[i] = -1 ;
            }
            else
            a[i] =  1 ;
        }
        
        return cnt+kadansAlgo(a);
    }
    private static int kadansAlgo(int []a)
    {
        int sum = a[0] , max =a[0] ;
        
        for(int i= 1;i<a.length;i++)
        {
            sum = Math.max(a[i],sum+a[i]);
            max = Math.max(sum,max) ;
            
            
        }
        
        return Math.max(0,max);
    }
}
