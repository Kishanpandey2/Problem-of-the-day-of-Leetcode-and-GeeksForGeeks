class Solution 
{ 
    static int binarySearch(long arr[],int low,int high,long sum,long temp){
        int mid, index=-1;
        long diff=Long.MAX_VALUE;
        while(low<=high){
            mid = (low+high)/2;
            long first = arr[mid]-temp;
            long second = sum-arr[mid];
            if(Math.abs(first-second)<diff){
                diff=Math.abs(first-second);
                index=mid;
            }
            if(first<second){
                low=mid+1;
            }
            else high=mid-1;
        }
        return index;
    }
    long minDifference(int N, int A[]) 
    { 
        
        long arr[]=new long[N];
        arr[0]=A[0];
        for(int i=1;i<N;i++){
            arr[i]=A[i]+arr[i-1];
        }
        long ans = Long.MAX_VALUE;
        long w,x,y,z;
        for(int i=2;i<N-1;i++){
            int index = binarySearch(arr,0,i-1,arr[i-1],0);
            w = arr[index];
            x = arr[i-1]-w;
            index = binarySearch(arr,i,N-1,arr[N-1],arr[i-1]);
            y = arr[index]-arr[i-1];
            z = arr[N-1]-arr[index];
            ans = Math.min(ans,Math.max(w,Math.max(x,Math.max(y,z)))-
            Math.min(w,Math.min(x,Math.min(y,z))));
        }
        return ans;
    }
} 
