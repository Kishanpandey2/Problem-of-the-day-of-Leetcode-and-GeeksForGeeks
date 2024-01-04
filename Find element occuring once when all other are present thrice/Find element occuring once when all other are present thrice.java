 // Method -1 ( Time - O(n) ans Space - O(N) ) 

class Solution {
    static int singleElement(int[] arr , int N) {
        Map<Integer,Integer>map = new HashMap<>( ) ;
        
        for(int i : arr)
        map.put(i,map.getOrDefault(i,0)+1) ;
        
        for(Map.Entry<Integer,Integer>entry : map.entrySet())
        if(entry.getValue()==1)
        return entry.getKey() ;
        
        return -1;
    }
  
}



// Method - 2 (Time - O(N) ans Space - O(1) ) 
 

class Solution {
    static int singleElement(int[] arr , int N) {
        int ans = 0 ;
        
        for(int i = 0 ;i<32;i++)
        {
            int cnt = 0 ;
            for(int j= 0 ;j<N;j++)
            {
                if((arr[j]&(1<<i)) !=0)
                cnt++;
            }
            if(cnt % 3== 1)
            ans += (1<<i) ;
        }
        
        return ans;
    }
}
