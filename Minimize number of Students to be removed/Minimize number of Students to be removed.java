class Solution {
    public int removeStudents(int[] H, int n) {
        // code here
        ArrayList<Integer> dp=new ArrayList<>();
        for(int i=0;i<n;i++){
            int index=solve(H[i],dp);
            if(index==dp.size()){
                dp.add(H[i]);
            }else{
                dp.set(index,H[i]);
            }
        }
        return n-dp.size();
    }
    int solve(int ele,ArrayList<Integer> arr){
        int low=0;
        int high =arr.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)>=ele){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
};



Expected Time Complexity: O(N logN)
Expected Auxiliary Space: O(N)
