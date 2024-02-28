
class Solution{
    int DivisibleByEight(String s){
      
        if(s.length()<=3)
        {
            int no = Integer.parseInt(s) ;
            return (no%8)==0?1:-1;
        }
        
        String temp = "" ;
        
        int cnt = 0 ;
        for(int i= s.length()-1 ;i>=0;i--)
        {
            cnt++ ;
            temp = s.charAt(i)+temp ;
            if(cnt==3)break ;
        }
        int no = Integer.parseInt(temp);
        
       return (no%8)==0?1:-1 ;
    }
}
