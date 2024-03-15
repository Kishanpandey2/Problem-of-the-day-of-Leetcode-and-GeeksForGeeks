// Naive solution using priorityQueue 

/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
        PriorityQueue<Integer>pq = new PriorityQueue<>() ;
        
        Node cur =head ;
        while(cur != null)
        {pq.add(cur.data) ;
            cur  = cur.next ;
        }
        
        head = new Node(pq.poll());
        Node temp = head ;
      while(!pq.isEmpty())
      {
           Node p  = new Node(pq.poll()) ;
           temp.next = p ;
           temp  = temp.next;
      }
      
      return head;
   }

    
}










// Efficient solution


/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
        Node as = new Node(-1);
        Node dec =new Node(-1); 
        Node cur = head ;
        
        Node t1 = as ;
        Node t2 = dec ;
         while(cur != null)
        {
            t1.next = cur ;
            t1= t1.next ;
            
            cur =cur.next ;
            if(cur!=null)
            {
                t2.next = cur ;
                t2 = t2.next ;
                cur = cur.next ;
            }
            
            t1.next = null ;
            t2.next = null;
        }
        as = as.next ;
        dec = dec.next ;
        
        dec= reverse(dec);
        
        return sortedMerge(as,dec);
   }
    public Node reverse(Node root){
        Node cur = root ;
        Node prev = null ;
        
        while(cur != null)
        {
            Node next = cur.next ;
            cur.next = prev ;
            prev = cur ;
            cur = next ;
        }
        
        return prev ;
    }
    
    public Node sortedMerge(Node a,Node b){
        if(a == null)return b ;
        if(b==null)return a; 
        
        Node head = null, tail = null ;
        if(a.data<=b.data)
        {
            head = a; tail = a; a = a.next ;
        }
        else
        {
             head = b; tail = b; b = b.next ;
        }
        
        
        while(a!=null && b!= null){
            if(a.data<=b.data)
        {
            tail.next = a ;
            tail = a; a = a.next ;
        }
        else
        {
            tail.next = b ;
              tail = b; b = b.next ;
        }
        
        }
        
        if(a==null)
        tail.next = b ;
        else
        tail.next =a ;
        
        return head;
    }
}
