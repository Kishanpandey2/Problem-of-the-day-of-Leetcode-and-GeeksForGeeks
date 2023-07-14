class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        Map<Integer,Integer>map = new HashMap<>() ;
        for(int i = 0 ;i<arr.length ;i++)
        {
            int temp = arr[i]- diff ;
            if(map.containsKey(temp))
            map.put(arr[i],map.get(temp)+1) ;
            else
            map.put(arr[i],1) ;
        }

        int max = Integer.MIN_VALUE ;
        for(Integer i : map.values())
        {
            max = Math.max(max,i);
        }
        return max;
    }
}
