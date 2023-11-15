class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        boolean flag=false;
        int len=arr.length;
        if(arr.length==1)
        {
            return 1;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1] || arr[i+1]-arr[i] > 1 || arr[0]!=1)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            return arr[len-1];
        }
        Arrays.sort(arr);
        for(int i=0;i<len;i++)
        {
            if(i==0 && arr[0]!=1)
            {
                arr[0]=1;
            }
            else if(i>0)
            {
                if(arr[i]-arr[i-1]>1)
                {
                    arr[i]=arr[i-1]+1;
                }
            }
        }
        return arr[len-1];
    }
}
