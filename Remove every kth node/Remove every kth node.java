class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        if(k == 1)return null;
	  Node prev = head ;
	  int cnt = 1 ;
	  Node cur = head ;
	  while(cur != null){
	      if(cnt %k == 0 ){
	          prev.next  = cur.next ;
	          cur  = prev ;
	      }
	      
	      prev  = cur ;
	      cur = cur.next ;
	      cnt++;
	  }
	  
	  return head;
    }
}
