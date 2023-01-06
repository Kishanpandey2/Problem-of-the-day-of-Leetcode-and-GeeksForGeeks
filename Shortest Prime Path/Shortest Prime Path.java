class Solution
{
    int[] prime;
    Solution()
    {
        // Every index of prime stores tero or one
        // If prime[i] is tero means i is not a prime
        // If prime[i] is one means i is a prime
        prime = new int[10000] ;
        Arrays.fill(prime,1) ;
        prime[1]= 0;
        for(int i = 2 ;i<=9999;i++)
        {
            if(prime[i]==1)
            {
                for(int j = i*i;j<=9999;j+=i)
                prime[j]=0 ;
            }
        }
    }
    
    public int shortestPath(int Num1,int Num2){
        int res[] = new int[10000] ;
        Arrays.fill(res,-1) ;
        boolean visited[] = new boolean[10000] ;
        Queue<Integer>q = new LinkedList<>() ;
        q.add(Num1) ;
        visited[Num1]= false ;
        res[Num1]= 0 ;
        while(!q.isEmpty())
        {
            int current = q.poll() ;
            if(visited[current])
            continue ;
            
            String temp = Integer.toString(current) ;
            for(int i = 0 ;i<4;i++){
            for(char ch = '0' ;ch <='9' ;ch++)
            {
                if(ch==temp.charAt(i) || (ch=='0' && i==0))
                continue ;
                
                String s = temp.substring(0,i)+ch +temp.substring(i+1) ;
                
                int t = Integer.valueOf(s);
                if(prime[t]==1 && res[t]== -1)
                {
                    res[t]= 1+res[current];
                    q.add(t) ;
                }
            }
            }
            
        }return res[Num2] ;
    }
}
