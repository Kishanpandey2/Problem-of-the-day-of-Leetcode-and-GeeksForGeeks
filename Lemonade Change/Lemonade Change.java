
class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
       int five = 0 , ten =0 ;
       for(int i =0 ;i<bills.length ;i++){
           int temp = bills[i] ;
           if(temp==5)
           five++;
           else if(temp == 10 )
           {
               ten++ ;
               five--;
           }
           else
           {
               if(temp ==20)
               {
                   if(ten>0)
                   {
                       ten-- ;five--;
                   }
                   else
                   five-=3;
               }
           }
           if(five<0)
           return false;
       }
       return true;
    }
}
