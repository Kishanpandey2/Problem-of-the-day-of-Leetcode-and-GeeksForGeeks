class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)return head;

        ListNode prev = head;
        ListNode cur = head.next;

        while(cur != null){
            int val = gcd(prev.val,cur.val);

            ListNode temp = new ListNode(val);

            temp.next = cur;
            prev.next = temp;

            prev = cur;
            cur = cur.next;
        }
        return head;
    }
    int gcd(int a,int b){
        if(b == 0 )return a;

        return gcd(b,a%b);
    }
}
