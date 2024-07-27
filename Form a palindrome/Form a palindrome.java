// Brute Force solution

class Solution{
    static int countMin(String str)
    {
        StringBuilder sb  = new StringBuilder(str); 
        sb.reverse();
        
        return str.length()-lcs(0,0,str,sb.toString());
        
    }
    
    
    static int lcs(int i ,int j,String s1,String s2){
        if(i == s1.length() || j == s2.length())
        return 0 ;
        
        if(s1.charAt(i)==s2.charAt(j))
        return 1+lcs(i+1,j+1,s1,s2);
        
        int ch1 = lcs(i+1,j,s1,s2);
        int ch2 = lcs(i,j+1,s1,s2);
        
        return Math.max(ch1,ch2);
    }
}



// Efficient solution

class Solution{
    static int [][]dp ;
    static int countMin(String str)
    {
        dp = new int[501][501];
        
        for(int i[]: dp)
        Arrays.fill(i,-1);
        
        StringBuilder sb  = new StringBuilder(str); 
        sb.reverse();
        
        return str.length()-lcs(0,0,str,sb.toString());
        
    }
    
    
    static int lcs(int i ,int j,String s1,String s2){
        if(i == s1.length() || j == s2.length())
        return 0 ;
        
        if(dp[i][j]!= -1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        return dp[i][j] =  1+lcs(i+1,j+1,s1,s2);
        
        int ch1 = lcs(i+1,j,s1,s2);
        int ch2 = lcs(i,j+1,s1,s2);
        
        return dp[i][j]= Math.max(ch1,ch2);
    }
}
