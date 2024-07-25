
class Solution {
    public Node sortedArrayToBST(int[] nums) {
       return help(nums,0,nums.length-1);
    }
    Node help(int []ar,int low,int high){
        if(low>high)return null;
        
        if(low == high)return new Node(ar[low]);
        
        int mid = (low+high)/2 ;
        Node root = new Node(ar[mid]);
        root.left = help(ar,low,mid-1);
        root.right = help(ar,mid+1,high);
        
        return root;
    }
}
