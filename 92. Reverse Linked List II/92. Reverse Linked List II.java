
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        if (left == right)
            return head;

        ListNode curr = head;
        ListNode t = null;
        ListNode prev = null;
        ListNode s = null;
        ListNode v = null;
        boolean f = false;

        if (left == 1) {
            f = true;
            t = curr;
        }

        int s1 = 1;

        while (curr != null) {
            if (s1 == left && !f) {
                v = prev;
                t = curr;
            }

            if (s1 == right) {
                s = curr.next;
                curr.next = null;
                break;
            }

            prev = curr;
            curr = curr.next;
            s1++;
        }

        if (!f) {
            v.next = null;
        }

        ListNode ans = reverseList(t);
        t.next = s;

        if (!f) {
            v.next = ans;
        }

        if (f) {
            head = ans;
        }

        return head;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
