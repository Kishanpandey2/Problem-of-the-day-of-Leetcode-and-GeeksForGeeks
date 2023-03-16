class Solution{
    static String secondSmallest(int S, int D){
       if(S >= D*9)
       return "-1" ;
       
       char []res =  new char[D] ;
       S = S - 1 ;
       
       for(int i = D-1 ;i>0 ;i--){
           if(S > 9 )
           {
               res[i] = (char)(9+'0') ;
               S -= 9 ;
           }
           else
           {
                res[i] = (char)(S+'0') ;
                S =  0 ;
           }
       }
       
       res[0] = (char)(S+1+'0') ;
       
       int index = D-1 ;
       
       for(int i = D-1 ;i>=0 ;i--){
           if(res[i] == '9')
           index = i ;
           else break;
       }
       res[index ] -= 1 ;
       res[index-1] += 1 ;
       
       return String.valueOf(res);
    }
} 
