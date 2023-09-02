class Solution{
     public int getCount(Node node, int bud)
    {
        //code here  
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        int level=1;
        q.add(node);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                if(temp.left==null&&temp.right==null){
                    list.add(level);
                    
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            level++;
        }
     //   System.out.print(list);
        Collections.sort(list);
        int count=0;
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
            if(sum>bud){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
