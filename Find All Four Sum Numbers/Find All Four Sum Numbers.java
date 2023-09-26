
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr ) ;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;
        for(int i  = 0 ;i<arr.length-3 ;i++){
            if(i>0 && arr[i]==arr[i-1])continue ;
            for(int j = i+1 ;j<arr.length -2;j++){
               if(j>i+1 && arr[j]==arr[j-1])continue ;
                int start = j+1 , end = arr.length-1 ;
                
                while(start<end){
                    int t = arr[i]+arr[j]+arr[start]+arr[end] ;
                    if(t == target )
                    {
                        ArrayList<Integer>temp = new ArrayList<>() ;
                        temp.add(arr[i]) ;temp.add(arr[j]) ;
                    temp.add(arr[start]) ;
                        temp.add(arr[end]) ;
                        ans.add(temp) ;

                        while(start<end && arr[start]==arr[start+1])start++ ;
                        while(start<end && arr[end]==arr[end-1])end-- ;
                        start++ ; end-- ;
                    }
                    else if(t > target )
                    end-- ;
                    else
                    start++  ;
                }
            }

        }
        return ans ;
    }
}
