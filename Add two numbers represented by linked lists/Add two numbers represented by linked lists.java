
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        
        if(num1 == null)return num2 ;
        else if(num2== null)return num1 ;
        
       Node h1= reverse(num1) ;
       Node h2 = reverse(num2);
       
       Node ans = null;

       int carry = 0 ;
       
       while(h1 != null || h2 != null){
           int no1 = h1 == null ? 0 : h1.data ;
           int no2 =  h2 == null ? 0 : h2.data ;
           int sum = no1+no2 +carry;
           
           
           carry = sum / 10;
           int d = sum%10;
           Node n = new Node(d);
           
           if(ans == null)
           ans = n ;
           else
           {
               n.next= ans ;
                ans = n;
           }
          h1  = h1 != null ?h1.next : null;
          h2  = h2 != null ?h2.next : null;
       }
       
       if(carry > 0)
       {
           Node n  =new Node(carry);
            if(ans == null)
           ans = n ;
           else
           {
               n.next= ans ;
                ans = n;
           }
       }
      
      
       return ans;
       
    }
    
    static Node reverse(Node head){
        if(head == null || head.next == null)return head ;
        
        Node cur = head , prev= null ;
        
        while(cur != null){
            Node next = cur.next ;
            cur.next =prev ;
            prev = cur ;
            cur = next ;
        }
        
        return prev ;
    }
}
