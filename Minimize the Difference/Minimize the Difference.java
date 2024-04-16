// Method -1  in O(nlogn) 

class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        TreeSet<Integer>st  = new TreeSet<>() ;
        
        for(int i : arr)st.add(i) ;
        
        Map<Integer,Integer>map  = new HashMap<>() ;
        
        for(int i : arr)
        map.put(i,map.getOrDefault(i,0)+1)  ;
        
        
        int start = 0 ,end = 0 ;
        for(;end<k;end++)
        {
            map.put(arr[end],map.get(arr[end])-1) ;
            
            if(map.get(arr[end])==0)st.remove(arr[end]) ;
            
        }
        int ans = st.last()-st.first();
        
        while(end<n){
             map.put(arr[start],map.get(arr[start])+1) ;
             st.add(arr[start]) ;
             
              map.put(arr[end],map.get(arr[end])-1) ;
               if(map.get(arr[end])==0)st.remove(arr[end]) ;
               
               end++; start++ ;
               ans = Math.min(ans,st.last()-st.first()) ;
        }
        
        return ans;
    }
}
        




// Method - 2


class Solution {
    public static int minimizeDifference(int n, int k, int[] arr) {
        int rmax[]= new int[n];
        int rmin[]= new int[n];
        
        rmax[n-1] = arr[n-1] ;
        rmin[n-1] = arr[n-1] ;
        
        for(int i = n-2;i>=0;i--)
        {rmax[i] = Math.max(rmax[i+1],arr[i]);
            rmin[i] = Math.min(rmin[i+1],arr[i]);
        }
        
        
        int ans = rmax[k]- rmin[k] ;
        int lmax = arr[0], lmin = arr[0] ;
        
        for(int i =1;i<n-k;i++)
        {
            int mxRem = Math.max(lmax,rmax[i+k]);
            int mnRem = Math.min(lmin,rmin[i+k]);
            
            ans = Math.min(ans,mxRem-mnRem) ;
            lmax = Math.max(lmax,arr[i]) ;
            lmin = Math.min(lmin,arr[i]) ;
        }
        ans = Math.min(ans,lmax-lmin) ;
        return ans;
      }
}
        
