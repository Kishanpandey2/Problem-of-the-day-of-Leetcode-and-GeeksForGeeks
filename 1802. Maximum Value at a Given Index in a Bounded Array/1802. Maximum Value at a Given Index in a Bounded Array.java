class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long lt=index;
        long rt=n-index-1;
        long st=1;
        long end=maxSum;
        while(st<=end) {
            long mid=st+(end-st)/2;
            long m=mid-1;
            long ls=0;
            long rs=0;
            if(m>=lt) {
                long notInRange=m-lt;
                ls=m*(m+1)/2-(notInRange)*(notInRange+1)/2;
            }
            else {
                ls=m*(m+1)/2+1*(lt-m);
            }
            if(m>=rt) {
                long notInRange=m-rt;
                rs=m*(m+1)/2-(notInRange)*(notInRange+1)/2;
            }
            else {
                rs=m*(m+1)/2+1*(rt-m);
            }
            long sum=rs+ls+mid;
            if(sum>maxSum) {
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return (int)end;
    }
}
