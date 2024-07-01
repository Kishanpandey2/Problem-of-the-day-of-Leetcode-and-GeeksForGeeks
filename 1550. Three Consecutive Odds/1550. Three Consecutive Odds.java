class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3)return false;

        int odd = 0 ;
        for(int i = 0 ;i<3;i++)
        if(arr[i]%2!=0) odd++;

        if(odd==3)return true;

        int st = 0 ;

        for(int i = 3;i<arr.length;i++)
        {
            if(arr[i]%2!=0)odd++;
            if(arr[st++]%2!=0)odd--;
            if(odd==3)return true;
            
        }

        return false;

    }
}
