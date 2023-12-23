
class Solution 
{
    public int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer,Integer>map = new HashMap<>() ;
        
        for(int i : arr)
        map.put(i,map.getOrDefault(i,0)+1) ;
        
        int ans = 0 ;
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue()>(n/k))
            ans++;
        }
        return ans ;
    }
}
