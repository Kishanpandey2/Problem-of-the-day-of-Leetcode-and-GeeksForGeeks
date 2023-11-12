
class Solution
{
    public static boolean isRotated(String str1, String str2)
    {
           int n1 = str1.length();

    int n2 = str2.length();

    if(n1 != n2) {

        return false;

    }

    

    String rotatedLeft = str1.substring(2) + str1.substring(0, 2);

    String rotatedRight = str1.substring(n1 - 2) + str1.substring(0, n1 - 2);

    

    return rotatedLeft.equals(str2) || rotatedRight.equals(str2);
    }
    
}
