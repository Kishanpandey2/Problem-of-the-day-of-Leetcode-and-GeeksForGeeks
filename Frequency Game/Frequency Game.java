 
class Solution {
     
    public static int LargButMinFreq(int arr[], int n) {
        Map<Integer,Integer>map = new HashMap<>() ;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1) ;
        }
        int minFreq = Integer.MAX_VALUE ;
        int ans = 0 ;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()<=minFreq  && entry.getKey()>ans)
            {
                minFreq = entry.getValue() ;
                ans = entry.getKey() ;
            }
        }
        return ans ;
    }
}
