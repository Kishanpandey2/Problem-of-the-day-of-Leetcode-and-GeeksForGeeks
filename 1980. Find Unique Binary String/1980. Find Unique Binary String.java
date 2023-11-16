class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String>givenString = new HashSet<>() ;
        for(String s: nums) givenString.add(s) ;

        Set<String>ans = new HashSet<>() ;

        generateString("","",nums[0].length(),ans,givenString) ;

            String res = "" ;
        for(String s : ans)
        {
            res = s ;
            break;
        }

        return res;
    }

    private void generateString(String str,String t, int len, Set<String>ans,Set<String>givenString){
        if(str.length()>len)return ;

        if(str.length()==len)
        {
            if(!givenString.contains(str))
            ans.add(str);
        }

        str+=t ;

         generateString(str,"1",len,ans,givenString) ;
          generateString(str,"0",len,ans,givenString) ;
    }
}
