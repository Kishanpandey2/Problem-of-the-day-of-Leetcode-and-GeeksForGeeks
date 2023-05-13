
class Solution {
    public static int bitMagic(int n, int[] arr) {
         
            int i = 0;
        int j = n-1;
       int count = 0;
        while(i<j){

            if(arr[i]!=arr[j])
            {
                count++;
            }
            i++;
            j--;
        }


        if(count%2==0)
        {
            return count/2;
        }
        return count/2 + 1;

    }
}  
