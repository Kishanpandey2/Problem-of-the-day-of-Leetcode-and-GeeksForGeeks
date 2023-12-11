class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int N){
        long sum = 0;
        long value = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr.get(i);
        }
        value = Math.max(sum,value);
        for(int i=1;i<=arr.size()-k;i++){
            int j = i+k-1;
            sum = sum + arr.get(j) - arr.get(i-1);
            value = Math.max(sum,value);
        }
        return value;
    }
}
