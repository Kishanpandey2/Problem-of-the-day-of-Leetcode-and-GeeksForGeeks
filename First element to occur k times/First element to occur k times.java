
class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        int []vis = new int[201] ;
        
        for(int i : a)
       { vis[i]++ ;
           if(vis[i]>=k)return i;
       }
        
 
        return -1;
    } 
}
