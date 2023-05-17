class Solution {
    public int pairSum(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        ListNode prevPtr = null;

       
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            ListNode nextNode = slowPtr.next;
            slowPtr.next = prevPtr;
            prevPtr = slowPtr;
            slowPtr = nextNode;
        }
 
        if (fastPtr != null) {
            slowPtr = slowPtr.next;
        }

        int maxSum = Integer.MIN_VALUE;
        while (slowPtr != null) {
            maxSum = Math.max(maxSum, slowPtr.val + prevPtr.val);
            slowPtr = slowPtr.next;
            prevPtr = prevPtr.next;
        }
        return maxSum;
    }
}
