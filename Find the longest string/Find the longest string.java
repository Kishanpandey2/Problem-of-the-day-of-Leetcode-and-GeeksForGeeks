class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        HashSet<String > st = new HashSet<>() ;
        for(String s: arr)
        st.add(s) ;
        String res = "" ;
        for(String s : arr)
        {
            if(s.length()<res.length())
            continue;
            else
            {
                if(allPrifix(s,st))
                {
                    if(s.length()>res.length())
                    res =s ;
                    else
                    {
                        if(s.compareTo(res)<0)
                        res = s ;
                    }
                }
            }
        }
        return res ;
    }
    public static boolean allPrifix(String s , HashSet<String > st )
    {
        for(int i = 1;i<s.length();i++)
        {
            String temp = s.substring(0,i) ;
            if(!st.contains(temp))
            return false ;
        }
        return true;
    }
}
       

Expected Time Complexity: O(NlogN)
Expected Space Complexity: O(N)

