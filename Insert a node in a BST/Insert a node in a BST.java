
class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
     Node curr = root, prev = root;
        while(curr != null){
            if(curr.data == Key) return root;
            else if(curr.data > Key){
                prev = curr;
                curr= curr.left;
            }else {
                prev =curr;
                curr = curr.right;
            }
        }
        if(prev.data > Key) prev.left = new Node(Key);
        else prev.right = new Node(Key);
        return root;
    }
}
