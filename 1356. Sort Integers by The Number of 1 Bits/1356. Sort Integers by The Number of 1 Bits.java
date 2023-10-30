class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                int val = ones(a) - ones(b) ;
                if(val!=0)return val ;
                else return a-b ;
               
            }
        }) ;


        int []ans = new int[arr.length ] ;

        for(int i : arr) pq.add(i) ;

        int i = 0 ;
        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }

        return ans;
    }


    public int ones(int n){
        int cnt = 0 ;

        while(n>0)
        {
            n = (n-1)&n ;
            cnt++;
        }

        return cnt;
    }
}
