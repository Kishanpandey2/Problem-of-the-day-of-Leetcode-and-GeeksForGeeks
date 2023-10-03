
class Solution
{
    String colName (long n)
    {
         String str="";
        int i=0;
        while(n>0){
            char r=(char)('A'+(n-1)%26);
            str=r+str;
            n=(n-1)/26;
        }
        return str;
    }
}
