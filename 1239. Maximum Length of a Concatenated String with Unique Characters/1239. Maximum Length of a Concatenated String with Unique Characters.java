class Solution {
    public int maxLength(List<String> arr) {
        List<String> ansList = new ArrayList<>() ;

        int ans = 0 ;
        ansList.add("");
        for(String str : arr)
        {
            if(!allUniqueChar(str))continue ;

            List<String>newAnsList = new ArrayList<>() ;
            for(String s: ansList)
            {
                String temp = s+ str ;
                if(allUniqueChar(temp))
                {newAnsList.add(temp);
                    ans = Math.max(ans,temp.length());
                }
            }

            ansList.addAll(newAnsList) ;
        }

        return ans;
    }

    boolean allUniqueChar(String s){
        int []freq = new int[26] ;

        for(char ch : s.toCharArray())
        if(freq[ch-'a']>0)return false;
        else
        freq[ch-'a']++ ;

        return true;
    }
}
