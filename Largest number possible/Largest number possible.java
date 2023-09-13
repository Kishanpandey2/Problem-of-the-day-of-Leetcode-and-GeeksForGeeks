
class Solution{
    static String findLargest(int N, int S){
        int no = 0 ;
        if(S==0 && N>1)return "-1";
        
        StringBuilder sb = new StringBuilder() ;
        
        while(N>0){
            if(S>=9){
               sb.append(9) ;
                S-=9;
                N--;
            }
            else
            { 
                sb.append(S) ;
                S=0;
                N--;
            }
            
        }
        
        if(S>0)return  "-1";
        
      
        return sb.toString();
    }
}
