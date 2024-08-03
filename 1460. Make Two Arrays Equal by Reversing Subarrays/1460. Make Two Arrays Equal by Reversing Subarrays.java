class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length)return false;
        int[] f1 = new int[1001];
        int[] f2 = new int[1001];
        for(int i =0 ;i<target.length;i++)
        {
            f1[target[i]]++;
            f2[arr[i]]++;
        }

        // for(int i = 0;i<f1.length;i++)
        // {
        //     if(f1[i]!= f2[i])return false;
        // }

        // return true;

        return Arrays.equals(f1,f2);
    }
}
