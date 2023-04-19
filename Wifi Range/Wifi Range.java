class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        int zero = 0 ,one = 0 ;;
        
        for(int i =0 ;i<N ;i++){
            if(S.charAt(i)=='1')
            {
                if(zero>0)
                {
                    if(one == 0 && zero>X)
                    return false ;
                    else if( zero>2*X)
                    return false ;
                }
                zero =0 ;
                one = 1 ;
            }
            else
            zero++;
        }
        if(zero>0 )
        {
            if(one==0||zero>X)
            return false ;
        }
        return true ;
        
       
    }
}
