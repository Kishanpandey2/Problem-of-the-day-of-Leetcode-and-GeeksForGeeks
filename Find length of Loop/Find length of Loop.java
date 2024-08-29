
/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
      Node s = head;
      Node f = head;
      int cnt = 0 ;
      while(f != null && f.next != null){
          s = s.next;
          f = f.next.next;
          
          if(s == f){
              cnt = 1;
              s = s.next;
              
              while(s!= f)
              {
                  cnt++;
                  s= s.next;
              }
              return cnt;
          }
      }
      
      return 0;
    }
}
