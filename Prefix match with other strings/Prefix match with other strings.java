
class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        int cnt = 0 ;
        if(k>str.length())
        return 0 ;
        String temp = str.substring(0,k);
        for(int i = 0 ;i<arr.length ;i++)
        {
            if(k>arr[i].length())
            continue;
            
            String s = arr[i].substring(0,k) ;
            if(s.equals(temp))
            cnt++;
        }
        return cnt;
    }
}
