class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
         
        
        for(int i = 0,j=0 ;i<n && j<arr2.length;i++,j++)
        {
            if(arr1[i]!= arr2[j])return i;
        }
         
        return n-1;
    }
}
