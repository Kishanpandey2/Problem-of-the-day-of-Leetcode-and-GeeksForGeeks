
/*
node class of binary tree
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/


class Solution{
    public int sumOfLongRootToLeafPath(Node root)
    {
       sol(root);
       return root.data;
    }
    public int sol(Node root)
    {
       if(root.left==null&&root.right==null) return 0;
       else if(root.left==null)
       {
           int e=sol(root.right);
           root.data+=root.right.data;
           return e+1;
       }
       else if(root.right==null)
       {
           int e=sol(root.left);
           root.data+=root.left.data;
           return e+1;
       }
       int re=sol(root.right);
       int le=sol(root.left);
      if(le==re)
      {
          int data=Math.max(root.left.data,root.right.data);
          root.data+=data;
          return le+1;
      }
      else if(le>re)
      {
          root.data+=root.left.data;
          return le+1;
      }
      else {
           root.data+=root.right.data;
           return re+1;
      }
    }
}
