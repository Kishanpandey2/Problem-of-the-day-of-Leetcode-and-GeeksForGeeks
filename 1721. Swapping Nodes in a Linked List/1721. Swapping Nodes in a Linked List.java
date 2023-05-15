class Solution {
    public ListNode swapNodes(ListNode head, int k) {
    ListNode temp = head,a = head,b = head;
        int c = 0;
        while(temp != null){ 
            c++;
            if(c == k) a = temp;
            temp = temp.next;
        }
        temp = head;
        for(int i=1;i<=c;i++){
            if(i == (c + 1 - k)){ 
                b = temp;
                break;
            }
            temp = temp.next;
        }
        int t = a.val;
        a.val = b.val;
        b.val = t;
        return head;
    }
}
