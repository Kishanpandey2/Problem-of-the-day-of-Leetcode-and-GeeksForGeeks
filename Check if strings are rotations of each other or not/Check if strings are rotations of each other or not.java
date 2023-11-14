

class Solution
{
    public static boolean areRotations(String s1, String s2 )
    {
        return (s1+s1).indexOf(s2)>=0 ;
    }
    
}
