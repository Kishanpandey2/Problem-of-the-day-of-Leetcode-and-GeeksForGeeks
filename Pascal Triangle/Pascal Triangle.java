
class Solution {
    long mod = 1000000007;
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
       ArrayList<Long> pre = new ArrayList<>(); ;
       
       for(int i = 0 ;i<n;i++)
       {
          ArrayList<Long> row = new ArrayList<>() ;
           
           for(int j = 0;j<=i;j++)
           {
               if(j == 0 || j == i)
               row.add(1l) ;
               else
               row.add((pre.get(j)%mod+pre.get(j-1)%mod)%mod);
           }
           
           pre = row ;
       }
       return pre;
    }
}
