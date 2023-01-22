
class Solution {
    public static int solve(int N, int K, int[] arr) {
        int sum = 0;
        for(int i : arr)
        sum+=i ;
        ArrayList<Integer>factor = new ArrayList<>() ;
        for(int i = 1;i*i<=sum;i++)
        {
            if(sum%i==0)
           { 
               factor.add(i) ;
            if(i!=sum/i)
            factor.add(sum/i) ;
           }
        }
        Collections.sort(factor) ;
        for(int i =1 ;i<arr.length ;i++){
          arr[i]= arr[i-1]+arr[i] ;
        }
        int ans = 0 ;
        for(int i = factor.size()-1;i>=0;i--)
        {
            int c  = 0 ;
            int tmp = factor.get(i) ;
            for(int j =0 ;j<N ;j++)
            {
                if(arr[j]%tmp==0)
                c++ ;
            }
            if(c>=K)
            {
               ans = tmp ;
                break;
            }
        }
        return ans ;
    }
}


Expected Time Complexity: O(N * x)
Expected Auxiliary Space: O(x), x is the number of factors of the sum of all
      
