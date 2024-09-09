
class Solution {
   
    public void sort012(ArrayList<Integer> arr) {
        int low = 0 ,mid = 0 , high = arr.size()-1;
        
        while(mid<= high)
        {
            if(arr.get(mid)== 0)
            {
                swap(arr,mid,low);
                low++; mid++;
            }
            else if(arr.get(mid)==2)
            {
                swap(arr,mid,high);
                high--;
            }
            else
            mid++;
        }
         
    }
    
    void swap(ArrayList<Integer>arr,int i,int j)
    {
        int t = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,t);
        
        
    }
}
