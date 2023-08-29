class Solution {
    public int bestClosingTime(String customers) {
     int totOpen = 0 ;
     for(char ch : customers.toCharArray())
     totOpen += ( ch == 'Y'?1:0) ;   
    
    int curOpen = 0 , curClose = 0 ;
    int hour = 0 ;
    int ans = Integer.MAX_VALUE;

       for(int i = 0 ;i<customers.length() ;i++){
        int curPenalty = (totOpen - curOpen + curClose) ;

        if(curPenalty<ans)
        {
            ans = curPenalty ;
            hour = i ;
        }
        curOpen+= ( customers.charAt(i)=='Y'?1:0 );
        curClose+= ( customers.charAt(i)=='N'?1:0) ;
        
        }

       int curPenalty = (totOpen - curOpen + curClose) ;

        if(curPenalty<ans)
        {
            ans = curPenalty ;
            hour = customers.length()  ;
        }

        return hour ;
    }
        
}
