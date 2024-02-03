
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */

class Solution
{
   long DecimalValue(Node head)
   {
       
    long mod  = 1000000007 ;
 	long ans = 0 ;
 	
 	Node cur = head ;
 	    int cnt = 0 ;
 	
 	while(cur != null){
 	    ans = (ans*2  + cur.data)%mod ;
 	    cur = cur.next  ; 
 	   
 	}
 	
 
 	return ans;
 	
 	
   }
}
