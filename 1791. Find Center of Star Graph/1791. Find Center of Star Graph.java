class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int[] freq = new int[edges.length+2];
       for(int []ed : edges){
            freq[ed[0]]++ ;
            freq[ed[1]]++;
       } 

        for(int i = 0 ;i< freq.length;i++)
        if( freq[i] == n)return i;

        return -1;
    }
}
