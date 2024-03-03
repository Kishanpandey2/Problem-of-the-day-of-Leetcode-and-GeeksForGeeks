class Solution {
    String printLargest(int n, String[] arr) {
       Arrays.sort(arr, (x,y) -> (y+x).compareTo(x+y)) ;
       
       StringBuilder sb = new StringBuilder() ;
       
    //   for(String s : arr)
    //   sb.append(s) ;
       
      // return sb.toString() ;
      
      
      return String.join("",arr);
    }
}
