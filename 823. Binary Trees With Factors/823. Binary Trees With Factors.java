class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        if(arr.length == 0)return 0 ;
        Arrays.sort(arr);
        Map<Integer,Long>map = new HashMap<>() ;

        

        for(int i = 0;i<arr.length ;i++){
            long cnt = 1l ;
            for(int j =  0 ;j<i;j++)
            {
                if(arr[i]%arr[j]== 0 && map.containsKey(arr[i]/arr[j])){
                    cnt += map.get(arr[j]) * map.get(arr[i]/arr[j]) ;
                } 
            }

            map.put(arr[i],cnt) ;
        }

        long totalCnt = 0l ;

        for(Long l : map.values())
        totalCnt+= l ;

        return (int)(totalCnt%1000000007) ;
    }
}
