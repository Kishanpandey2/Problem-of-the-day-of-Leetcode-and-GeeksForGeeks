/*Structure of the Node of the BST is as
class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}
*/

class Solution
{
    
	public static int countPairs(Node root1, Node root2, int x)
	{
		 Set<Integer>st1 = new HashSet<>() ;
		 Set<Integer>st2 = new HashSet<>() ;
		inOrd(root1,st1) ;
		inOrd(root2,st2) ;
		
		int cnt = 0 ;
		for(Integer i : st1)
		{
		    int rem = x - i ;
		    if(st2.contains(rem))
		    {cnt++ ;
		    st2.remove(rem) ;}
		}
		
		return cnt ;
		
	}
	
	public static void inOrd(Node root,Set<Integer>st){
	if(root == null)return ;
	
	inOrd(root.left,st) ;
	st.add(root.data) ;
	inOrd(root.right,st);
	}
}
