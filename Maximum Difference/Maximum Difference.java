
class Solution {
    public int findMaxDiff(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int []ls = new int[arr.length];
       int []rs = new int[arr.length];
       
         Stack<Integer>st = new Stack<>() ;
         st.push(arr[0]);
       for(int i = 1;i<arr.length;i++)
      {
          while(st.size()>0 && st.peek()>=arr[i])
          st.pop() ;
          
          ls[i] = (st.size() == 0 )?0:st.peek();
          st.push(arr[i]);
      }
       
       st = new Stack<>() ;
       st.push(arr[arr.length-1]);
       
       for(int i = arr.length-2;i>=0;i--){
              while(st.size()>0 && st.peek()>=arr[i])
          st.pop() ;
          
          rs[i] = (st.size() == 0 )?0:st.peek();
          st.push(arr[i]);
       }
       
       
       for(int i =0 ;i<arr.length;i++)
       ans = Math.max(ans,Math.abs(ls[i]-rs[i]));
       
       return ans ;
    }
}
