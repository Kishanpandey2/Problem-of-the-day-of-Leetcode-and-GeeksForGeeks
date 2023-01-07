class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	if(root == null|| root.next==null)
	return root ;
	root.next = flatten(root.next) ;
	root = mergeList(root,root.next) ;
	return root ;
    }
   Node mergeList(Node x, Node y)
    {
        if(x==null) return y;
        if(y==null) return x;

         Node ans;
        if(x.data <= y.data)
        {
            ans =x;
            ans.bottom = mergeList(x.bottom,y);
        }
        else
        {
            ans= y;
            ans.bottom = mergeList(x, y.bottom);
        }
        return ans;
    }
}
