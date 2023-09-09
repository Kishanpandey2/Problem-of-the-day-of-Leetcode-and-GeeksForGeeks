class Solution
{
    
     public static void reverseInorder(Node root,ArrayList <Integer> arr){
        if(root==null){
            return;
        }
       reverseInorder(root.right,arr);
        arr.add(root.data);
      reverseInorder(root.left,arr);
     }
    public int kthLargest(Node root,int K)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        reverseInorder(root,arr);
        
        return arr.get(K-1);
    }
}




