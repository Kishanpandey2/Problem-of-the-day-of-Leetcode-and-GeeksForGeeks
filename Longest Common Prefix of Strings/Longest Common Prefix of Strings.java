
class Solution {
    public String longestCommonPrefix(String arr[]) {
     if(arr.length==1)return arr[0];
     
     
     String ans = "" ;
     
     
     int len = Math.min(arr[0].length(),arr[1].length());
     int i ;
     for( i = 0 ;i<len;i++)
     {
         if(arr[0].charAt(i)!=arr[1].charAt(i))break;
     }
      if(i == 0)return "-1";
    // System.out.println(arr[0].substring(0,i));
     
     ans = arr[0].substring(0,i);
     
     for( i = 1;i<arr.length-1;i++)
     {
         String s1 = arr[i] ;
         String s2 = arr[i+1];
         
         int n = Math.min(s1.length(),s2.length());
     int c;
     for( c = 0 ;c<n;c++)
     {
         if(s1.charAt(c)!=s2.charAt(c))break;
     }
     
     if(c == 0)return "-1";
     ans = s1.substring(0,c);
     }
     
     return ans;
    }
}
