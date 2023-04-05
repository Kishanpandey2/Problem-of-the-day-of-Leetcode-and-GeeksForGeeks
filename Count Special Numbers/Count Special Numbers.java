// Brute force or Naive solution in O(n^2) .
class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        int cnt = 0 ;
        for(int i = 0 ;i<N;i++){
            for(int j = 0 ;j<N;j++){
                if(i!=j && arr[i]%arr[j]==0)
                {cnt++;
                break ;
                }
            }
        }
        return cnt ;
    }
}



// Efficient solution 



class Solution {
    public int countSpecialNumbers(int N, int arr[]) {
        Map<Integer,Integer>freq = new HashMap<>() ;
        Set<Integer>unique = new HashSet<>() ;
        
        int mx = 0  ;
        
        for(int i = 0 ;i<N; i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1) ;
            unique.add(arr[i]) ;
            mx = Math.max(mx,arr[i]) ;
        }
        Set<Integer>special = new HashSet<>() ;
        for(int i : unique){
            for(int j = 2*i ; j<=mx ;j+=i){
                if(unique.contains(j))
                special.add(j) ;
            }
        }
        int ans = 0 ;
        
        for(Map.Entry<Integer,Integer>entry: freq.entrySet()){
            if(entry.getValue() >1)
            ans += entry.getValue() ;
            else if(special.contains(entry.getKey()))
            ans++ ;
        }
        
        return ans ;
    }
}
