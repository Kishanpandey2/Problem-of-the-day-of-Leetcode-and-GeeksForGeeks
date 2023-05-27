class Solution
{
    public static Node modifyTheList(Node head)
    {
        ArrayList<Integer>al = new ArrayList<>() ;
        Node cur = head ;
        while(cur!=null){
            al.add(cur.data) ;
            cur = cur.next ;
        }
        int n = al.size() ;
        cur = head ;
        for(int i = 0 ;i<n/2 ;i++){
            int x = al.get(n-i-1)-al.get(i) ;
            al.set(n-i-1,al.get(i)) ;
            al.set(i,x) ;
        }
        int i = 0 ;
        while(cur!=null){
            cur.data = al.get(i++) ;
            cur = cur.next ;
        }
        return head ;
    }
}
