// 1 st method 

class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public Solution(ListNode head) {
        
        while(head!=null)
        {
            ans.add(head.val) ;
            head = head.next ;
        }
    }
    
    public int getRandom() {
        return ans.get((int)(Math.random()*ans.size())) ;
    }
}





// 2nd method 

class Solution {
   ListNode head = null;
    public Solution(ListNode head) {
        this.head = head ;
    }
    
    public int getRandom() {
      ListNode cur = head ;

      int i = 1 ;
      int ans = 0 ;

      while(cur!= null){
          if(Math.random() < 1.0/i)
          {
              ans = cur.val ;
          }
          i++ ;
          cur = cur.next ;
      }
      return ans ;
    }
}
