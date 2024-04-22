class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String>vis = new HashSet<>() ;

        for(String s: deadends)
        vis.add(s) ;

        Queue<String>q = new LinkedList<>() ;

        int level = 0 ;
        q.add("0000") ;

        while(!q.isEmpty())
        {
            int size  = q.size() ;

            while(size-- >0){
                String cur = q.poll() ;
                if(vis.contains(cur))continue ;

                if(cur.equals(target))return level;
                for(String next : nextState(cur))
                {
                    if(!vis.contains(next))q.offer(next) ;
                }

                vis.add(cur) ;
            }
            level++;
        }
        return -1;
    }

    Set<String>  nextState(String lock){
        char []l = lock.toCharArray() ;
        Set<String>ans = new HashSet<>() ;

        for(int i = 0 ;i<4;i++){
            char ch = l[i] ;

            l[i] = ch =='9' ? '0' : (char)(ch+1);
            ans.add(new String(l));
            l[i] = ch =='0' ? '9' : (char)(ch-1);
            ans.add(new String(l));

            l[i] = ch ;
        }

        return ans;
    }
}
