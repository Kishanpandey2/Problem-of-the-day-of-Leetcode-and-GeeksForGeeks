class Solution {
    public Node sortedInsert(Node head, int data) {
        Node temp = new Node(data) ;
        if(head == null)
        {
            temp.next = temp;
            return temp;
        }
        boolean flag = false;
            if(data<=head.data)
            {
                Node cur = head ;
                while(cur.next!= head)
                cur = cur.next ;
                
                temp.next = head ;
                cur.next = temp ;
                return temp;
            }
            
            Node cur = head ;
            
            while(cur.next != head){
                if(cur.next.data >= data)
                {temp.next = cur.next ;
                cur.next = temp ;
                flag= true;
                    break;
                }
                
                cur = cur.next;
            }
            
            if(flag == false)
          { temp.next = head ;
              cur.next = temp ;
               
          }
        
            
            
            return head ;
            
    }
}
