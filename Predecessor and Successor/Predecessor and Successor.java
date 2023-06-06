// Method 1 

public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
        ArrayList<Integer>al = new ArrayList<>() ;
        inOrder(root,key,al) ;
       
        int p1 = -1 , p2 = -1 ;
        for(int i = 0 ;i<al.size();i++){
            if(al.get(i)>key){
               p1 = al.get(i) ;
               if((i-1)>=0 && al.get(i-1)!=key)
               p2 = al.get(i-1) ;
                 if((i-2)>=0 && al.get(i-1)==key)
               p2 = al.get(i-2) ;
               break;
            }
            if(i == al.size()-1 && al.get(i)<key)
            p2 = al.get(i);
                if(i == al.size()-1 && al.get(i)==key)
            p2 = al.get(i-1);
        }
        pre = new Node(p2) ;
        suc = new Node(p1);
}
static void inOrder(Node root,int k, ArrayList<Integer>al){
    if(root!=null){
        inOrder(root.left,k,al) ;
        al.add(root.data) ;
        inOrder(root.right,k,al) ;
    }
}

}


// Method 2 

public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
    pre = floor(root,key);
    suc = ceil(root,key);
}
static Node ceil(Node root,int k){
    Node res = null ;
    while(root!=null){
        if(root.data>k){
            res = root ;
            root = root.left ;
        }
        else
        root = root.right ;
    }
    return res;
}
static Node floor(Node root,int k){
    Node res = null ;
    while(root!=null){
        if(root.data>=k){
            
            root = root.left ;
        }
        else{
            res = root ;
         root = root.right ;}
    }
    return res;
}
}
