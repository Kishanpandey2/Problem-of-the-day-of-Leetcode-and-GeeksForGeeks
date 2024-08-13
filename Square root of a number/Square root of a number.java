// method - 1
class Solution {
    long floorSqrt(long n) {
        
        return (long)Math.sqrt(n) ;
    }
}



// method - 2
class Solution {
    long floorSqrt(long n) {
        return (long)Math.pow(n,0.5);
        
    }
}



// method -3 
class Solution {
    long floorSqrt(long n) {
        int i = 1 ;
      for(;i*i<=n;i++)
      if(i*i>n)break;
      
      if(i*i == n)return i ;
      
      return i-1;
        
    }
}





// method - 4
class Solution {
    long floorSqrt(long n) {
        long st = 0l , end= n ;
        long ans = 0l ;
        while(st<=end)
        {
         long mid = (st+end)/2 ;
         
         if(mid * mid == n)return mid ;
         
         else if(mid*mid <n)
         {
             ans = mid ;
             st = mid+1 ;
         }
         else
         end = mid -1 ;
        }
     return ans;
        
    }
}
