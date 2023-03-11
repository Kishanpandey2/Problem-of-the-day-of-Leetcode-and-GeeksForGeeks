class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return new TreeNode(head.val);
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode res=new TreeNode(slow.next.val);
        ListNode righthalf=slow.next.next;
        slow.next=null;
        res.left=sortedListToBST(head);
        res.right=sortedListToBST(righthalf);
        return res;
    }
}
