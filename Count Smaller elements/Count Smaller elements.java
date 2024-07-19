class Solution {
    int[] constructLowerArray(int[] arr) {
         int []ans = new int[arr.length];
         List<Integer>temp = new ArrayList<>() ;
         
         for(int i : arr)
         temp.add(i);
         
         Collections.sort(temp);
         
         for(int i = 0;i<arr.length;i++)
         {
             int ind = binarySearch(temp,arr[i]);
             
             ans[i] = ind;
             temp.remove(ind);
         }
         return ans;
    }
    
    int binarySearch(List<Integer>al,int target){
        int low = 0 , high  = al.size()-1,mid  = 0 ;
        
        int ind = -1 ;
        
        while(low<=high){
            mid = (low+high)/2 ;
            
            if(al.get(mid) == target)
            {
                ind = mid ;
                high = mid-1 ;
            }
            else if(al.get(mid) < target)
            {
                low = mid+1 ;
            }
            else
            high =mid-1 ;
        }
        
        return ind;
    }
}
