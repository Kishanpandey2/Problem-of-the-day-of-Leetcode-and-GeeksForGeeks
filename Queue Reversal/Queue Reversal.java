class GfG{
    
    public Queue<Integer> rev(Queue<Integer> q){
        help(q);
        return q;
    }
    void help(Queue<Integer>q)
    {
        if(q.size()==0)
        return ;
        
        int x = q.poll() ;
        help(q) ;
        q.add(x);
    }
}
