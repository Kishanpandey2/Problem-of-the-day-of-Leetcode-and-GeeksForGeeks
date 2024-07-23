 
class Solution {
     
    List<Integer>l1 ;
    List<Integer>l2 ;
    public List<Integer> merge(Node root1, Node root2) {
        l1 = new ArrayList<>() ;
        l2 = new ArrayList<>() ;
        
        List<Integer>ans = new ArrayList<>();
        int i = 0 , j = 0 ;
        
        inorder(root1,l1);
        inorder(root2,l2);
        // System.out.println(l1);
        //  System.out.println(l2);
        while(i<l1.size() && j<l2.size())
        {
            if(l1.get(i)<l2.get(j))
            {
                ans.add(l1.get(i));
                i++;
            }
            else if(l1.get(i)>l2.get(j))
            {
                ans.add(l2.get(j));
                j++;
            }
            else 
            {
                ans.add(l1.get(i));
                ans.add(l2.get(j));
                i++; j++;
            }
        }
        
        while(i<l1.size()){ans.add(l1.get(i));i++;}
                
        while(j<l2.size()){ans.add(l2.get(j));
            j++;
        }
        return ans;
    }
    
    void inorder(Node root,List<Integer>al){
        if(root!=null){
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }
    }
    
}



 
