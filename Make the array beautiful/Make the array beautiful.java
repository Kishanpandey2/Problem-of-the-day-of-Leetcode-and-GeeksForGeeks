class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
       
        ArrayList<Integer>ans = new ArrayList<>() ;
     
        for(int i = 0 ;i<arr.length ;i++){
            if(ans.size() != 0  && ( (ans.get(ans.size()-1)<0 && arr[i]>=0) || ( ans.get(ans.size()-1)>=0 && arr[i]<0)))
            ans.remove(ans.size()-1) ;
            else
            ans.add(arr[i]) ;
        }
        return ans ;
    }
}
