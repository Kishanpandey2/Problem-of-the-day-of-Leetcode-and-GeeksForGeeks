
/* A Binary Tree node

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    String mark = "$" ;
    HashSet<String>st = new HashSet<>();
    int dupSub(Node root) {
        String s = help(root) ;
       if(s.equals("#"))
       return 1 ;
       else
       return 0 ;
    }
    
    String help(Node root){
        StringBuilder  sb  = new StringBuilder() ;
        sb.append("") ;
        
        if(root == null)return sb.append(mark).toString() ;
        
        String lstr = help(root.left) ;
        if(lstr.equals("#") )return "#"  ;
        
        String rstr = help(root.right) ;
        if(rstr.equals("#"))return "#"  ;
        
        sb = sb.append(root.data).append(lstr).append(rstr) ;
       
        if(sb.length() > 3 && st.contains(sb.toString()))return "#" ;
        
        st.add(sb.toString()) ;
        return sb.toString();
    }
}
