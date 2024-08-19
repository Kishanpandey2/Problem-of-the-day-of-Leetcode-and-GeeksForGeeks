// Method - 1
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        int mx = 0 ;
        
        for(int i : arr)
        mx = Math.max(mx,i);
        
        int []freq = new int[mx+1];
        
        for(int i : arr)
        freq[i]++;
        
        for(int i = 0 ;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                k--;
                if(k == 0)return i ;
                
                
            }
        }
        
        return -1;
    }
}








// Method - 2


// User function Template for Java

class Solution {
    static int ans ;
    public static int kthSmallest(int[] arr, int k) {
    
    
     binarySearch(arr,0,1000000,k);;
    
   
    
    return ans;
      
    }
    
    static void binarySearch(int []ar,int low,int high,int k){
        
        int posAns = -1;
        int cnt = 0 ;
        int m = (low+high)/2 ;
        for(int i = 0 ;i<ar.length;i++)
        {
            if(ar[i]<=m)
            {
                cnt++;
                
                if(posAns == -1)
                posAns = ar[i];
                else
                posAns = Math.max(posAns,ar[i]) ;
                
            }
        }
        
        if(cnt == k)
        ans = posAns;
        else if(cnt < k)
        binarySearch(ar,m+1,high,k);
        else
        binarySearch(ar,low,m-1,k);
        
    }
}







// Method - 3


class Solution {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>() ;
        
        for(int i : arr)
        pq.add(i) ;
        
        while(k>1){
            pq.poll();
            k--;
        }
        
        return pq.poll() ;
      
    }
}
