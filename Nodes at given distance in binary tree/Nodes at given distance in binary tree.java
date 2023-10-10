
// class Node  
// { 
//     int data; 
//     Node left, right;
// }
class Solution
{
    static Node tar;
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        Map<Node,Node>hsparent=new HashMap<>();
        parentsmark(root,hsparent);
        Map<Node,Boolean>vis=new HashMap<>();
        Queue<Node>q1=new LinkedList<>();
        getTarget(root,target);
        q1.add(tar);
        vis.put(tar,true);
        int cl=0;
        while(!q1.isEmpty()){
            int size=q1.size();
            if(cl==k)break;
            cl++;
            for(int i=0;i<size;i++){
                Node temp=q1.poll();
                if(temp.left!=null && vis.get(temp.left)==null){
                    q1.offer(temp.left);
                    vis.put(temp.left,true);
                }
                if(temp.right!=null && vis.get(temp.right)==null){
                    q1.offer(temp.right);
                    vis.put(temp.right,true);
                }
                if(hsparent.get(temp)!=null && vis.get(hsparent.get(temp))==null){
                    q1.offer(hsparent.get(temp));
                    vis.put(hsparent.get(temp),true);
                }
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!q1.isEmpty()){
            Node temp=q1.poll();
            ans.add(temp.data);
        }
        Collections.sort(ans);
        return ans;
        
        
    }
    public static void getTarget(Node root,int t){
        if(root==null)return;
        if(root.data==t){
            tar=root;
            return;
        }
        getTarget(root.left,t);
        getTarget(root.right,t);
    }
    public static void parentsmark(Node root,Map<Node,Node>hs){
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.left!=null){
                hs.put(temp.left,temp);
                q.add(temp.left);
            }
            if(temp.right!=null){
                hs.put(temp.right,temp);
                q.add(temp.right);
            }
        }
    }
}
