class Solution {
    Node sortedInsert(Node head1, int key) {
        boolean flag = true ;
        Node newNode = new Node(key) ;
        if(head1 == null){
            head1 = newNode ;
            flag = false ;
        }
        else if(head1.data > newNode.data)
        {
            newNode.next = head1 ;
            head1 = newNode ;
            flag = false;
        }
        else
        {
            Node prev = head1, temp = head1 ;
            
            while(temp.next!= null)
           {
               prev = temp ;
               temp= temp.next ;
               
               if( temp.data> newNode.data)
               {
                   prev.next = newNode ;
                   newNode.next = temp ;
                   flag = false;
                   break;
               }
           }
           
           if(flag)
           {
               temp.next = newNode ;
           }
        }
        return head1;
    }
}
