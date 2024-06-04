
class Solution {
    String binaryNextNumber(String s) {
    char ch[] = s.toCharArray();
    boolean flag = true;
    int i ;
    for( i = ch.length-1;i>=0;i--)
    {
        if(ch[i]=='1')
        ch[i] = '0';
        else
        {
            flag= false;
            ch[i] ='1' ;
            break;
        }
    }
    
    if(flag )return "1"+new String(ch) ;
    
    i = 0 ;
    for(;i<ch.length;i++)
    if(ch[i]=='1')break;
    
    return new String(Arrays.copyOfRange(ch,i,s.length()));
    
    }
}
