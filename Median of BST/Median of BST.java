// Brute Force solution
class Tree
{
    public static float findMedian(Node root)
    {
    ArrayList<Integer>al = new ArrayList<>() ;
    inOrder(al,root);
    int n = al.size() ;
    if(n%2!=0)
    return al.get(n/2) ;
    else
    {
        int m1 = al.get(n/2);
        int m2 = al.get(n/2  -1);
        
        return (m1+m2)/2.0f;
    }
    }
    private static void inOrder(ArrayList<Integer>al  ,  Node root)
    {
        if(root == null)
        return ;
        inOrder(al,root.left);
        al.add(root.data) ;
        inOrder(al,root.right) ;
    }
}



// Method 2 using o(n) Time and O(1) Space
class Tree
{
    public static float findMedian(Node root)
{
    int n = cntNode(root);
    if(n%2!=0)
    {
        int []ans = new int[1];
        ans[0] = 0 ;
        find(root,ans,n/2 + 1,new int[]{0});
        return (float)ans[0];
    }
    else
    {
        int []ans1 = new int[1];
        int []ans2 = new int[1];
         find(root,ans1,n/2 ,new int[]{0});
          find(root,ans2,n/2 + 1,new int[]{0});
          
          return (ans1[0]+ans2[0])/2.0f;
    }
    
    }
    private static  int  cntNode(Node root)
    {
        if(root == null)
        return 0;
        return 1+cntNode(root.left)+cntNode(root.right);
    }
    private static void find(Node root, int []ans,int k,int []cnt)
    {
        if(root==null)
        return ;
       
        find(root.left,ans,k,cnt);
        cnt[0]++;
        if(cnt[0] == k)
        {
            ans[0] = root.data; return ;
        }
        
        find(root.right,ans,k,cnt);
    }
}

