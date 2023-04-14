class Pair{
    int a,b ;
    Pair(int a,int b){
        this.a =a  ;
        this.b = b ;
    }
}
class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        Stack<Pair>st = new Stack<>() ;
        for(int i = 0 ;i<N;i++){
            if(!st.isEmpty()&& (st.peek().a == color[i] && st.peek().b==radius[i]))
            {
                st.pop() ;
            }
            else
            st.push(new Pair(color[i],radius[i])) ;
        }
        return st.size();
    }
}
