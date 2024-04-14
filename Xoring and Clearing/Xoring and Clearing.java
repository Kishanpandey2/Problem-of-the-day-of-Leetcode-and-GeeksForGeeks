class Solution {
    public void printArr(int n, int arr[]) {
        for(int i : arr)
        {
            System.out.print(i +" ") ;
            
        }
        System.out.println() ;
    }

    public void setToZero(int n, int arr[]) {
       Arrays.fill(arr,0) ;
    }

    public void xor1ToN(int n, int arr[]) {
         int ind = 0 ;
        for(int i : arr)
        {
            arr[ind] = ind^i;
            ind++;            
        }
    }
}
