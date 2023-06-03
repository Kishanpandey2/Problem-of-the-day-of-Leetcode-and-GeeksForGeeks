
class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        int s1 =0 ,s2  = 0 , s3 = 0  ;
        for(int n:S1)
        s1+=n ;
        for(int n:S2)
        s2+=n ;
        for(int n:S3)
        s3+=n ;
        
        int i = 0 , j = 0 , k = 0 ;
        
        while(true){
            if(i==N1 || j==N2 || k==N3)
            return 0 ;
            
            if(s1==s2 && s2==s3)
            return s3 ;
            
            if(s1>=s2 && s1>=s3)
            s1-=S1[i++] ;
            else if(s2>=s1 && s2>=s3)
            s2-=S2[j++] ;
            else if(s3>=s2 && s3>=s1)
            s3-=S3[k++] ;
        }
      
    }
}
        
