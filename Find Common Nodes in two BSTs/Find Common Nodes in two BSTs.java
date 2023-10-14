// Brute Force solution
class Solution
{
    static Set<Integer>st;
    static  ArrayList<Integer>ans ;
   	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        st = new HashSet<>() ;
        
         ans = new ArrayList<>() ;
        
        in(root1) ;
        inCom(root2) ;
        return ans;
        
    }
    public static void in(Node root)
    {
      if(root!= null){
          in(root.left) ;
          st.add(root.data) ;
          in(root.right) ;
      }
    }
    public static void inCom(Node root){
        if(root!= null){
            inCom(root.left) ;
            if(st.contains(root.data))
            ans.add(root.data) ;
            
            inCom(root.right) ;
        }
    }
}

// Method 2

class Solution
{

	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
       Stack<Node>st1 = new Stack<>() ;
       Stack<Node>st2 = new Stack<>() ;
       ArrayList<Integer> ans = new ArrayList<Integer>() ;
       
       while(true){
           if(root1  != null){
               st1.push(root1) ;
               root1 = root1.left; 
           }
           else if(root2 != null){
               st2.push(root2) ;
               root2 = root2.left ;
            }
            else if(!st1.isEmpty() && !st2.isEmpty() ){
                 root1 = st1.peek() ;
                 root2 = st2.peek() ;
                
                if(root1.data == root2.data){
                    ans.add(root1.data) ;
                    st1.pop() ;
                     st2.pop() ;
                    root1 = root1.right ;
                    root2 = root2.right ;
                }
                else if(root1.data < root2.data){
                    st1.pop() ;
                    root1 = root1.right ;
                    root2 = null ;
                }
                else if(root1.data > root2.data)
                {
                     st2.pop() ;
                    root2 = root2.right ;
                    root1 = null ;
                }
            }
            else break ;
       }
       
       return ans;
    }
}
