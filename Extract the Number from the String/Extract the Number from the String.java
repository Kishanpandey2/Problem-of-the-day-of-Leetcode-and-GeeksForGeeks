
class Solution {
    long ExtractNumber(String sen) {
        long ans = -1 ;
        
            for(int i = 0 ;i<sen.length();i++)
            {
                if(sen.charAt(i)>='0' && sen.charAt(i)<='9')
                {
                    StringBuilder sb= new StringBuilder() ;
                    boolean flag = false;
                    while(i<sen.length() && sen.charAt(i)>='0' && sen.charAt(i)<='9' )
                    {
                        char ch = sen.charAt(i);
                        if(ch =='9')
                        flag = true;
                        sb.append(sen.charAt(i));
                        i++;
                    }
                    i--;
                    long no = Long.valueOf(sb.toString());
                    if(!flag && no>ans)
                    ans = no;
                }
            }
            
        return ans;
    }
}
