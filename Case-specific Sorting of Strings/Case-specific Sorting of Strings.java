class Solution
{
   
    public static String caseSort(String str)
    {
        
        if(str.length()==1)
        return str ;
       int lowerCount = 0 ;
       int upperCount = 0 ;
        for(int i =0 ;i<str.length() ;i++)
        {
            char ch = str.charAt(i) ;
            if(Character.isUpperCase(ch)) 
            upperCount++;
            else
           lowerCount++ ;
        }
        char []lowerChars = new char[lowerCount] ;
        char []upperChars = new char[upperCount] ;
        int i = 0, j= 0 ,k = 0 ;
        for( i = 0 ;i<str.length();i++)
        {
            char ch = str.charAt(i) ;
           if(Character.isUpperCase(ch)) 
           upperChars[j++]= ch ;
            else
            lowerChars[k++]= ch ;
        }
        Arrays.sort(upperChars);
        Arrays.sort(lowerChars);
        StringBuilder s = new StringBuilder() ;
        j=k = 0 ;
         for( i = 0 ;i<str.length();i++)
        {
            char ch = str.charAt(i) ;
           if(Character.isUpperCase(ch)) 
           s.append(upperChars[j++]);
            else
             s.append(lowerChars[k++]);
        }
        return s.toString() ;
    }
}

Expected Time Complexity: O(Nlog(N)).
Expected Auxiliary Space: O(N).
