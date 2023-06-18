class Solution {
    public static int distributeTicket(int N,int K)
    {
      ArrayDeque<Integer>ad = new ArrayDeque<>() ;
      for(int i = 1;i<=N;i++)
      ad.add(i) ;
      int flag = 0 ;
      int cur = 0 ;
      while(!ad.isEmpty()){
          int time = 0  ;
          if(flag ==0)
          {
              while(!ad.isEmpty() && time<K)
             {cur =  ad.pollFirst() ;time++;}
          }
          else
          { while(!ad.isEmpty() && time<K)
            {cur =   ad.pollLast() ;time++;}
          }
          flag = flag ==0 ?1:0 ;
              
      }
      return cur ;
      
      
    }
}
