
/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
       Set<Integer>st = new HashSet<>() ;
       
       for( int l : head1)
       st.add(l) ;
       
       int ans = 0 ;
       for(int i : head2)
       if(st.contains(x-i))
       {
           ans++ ; st.remove(x-i) ;
       }
       
       return ans;
    }
}
