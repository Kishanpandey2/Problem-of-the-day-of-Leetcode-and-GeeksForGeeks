class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int len = edges.length;
        int []dis1 = new int[len] ;
        int []dis2  = new int [len] ;
        Arrays.fill(dis1,-1);
        Arrays.fill(dis2,-1);
        dis1[node1]=0;
        dis2[node2]=0;
        int dist = 0 ;
        int i = node1;
        while(true)
        {
            dis1[i]=dist++;
            i = edges[i];
            if(i==-1 || dis1[i]!=-1)
            break;
        }
           i = node2;
           dist=0;
        while(true)
        {
            dis2[i]=dist++;
            i = edges[i];
            if(i==-1 || dis2[i]!=-1)
            break;
        }
        int res = -1 ;
        int mini = Integer.MAX_VALUE ;
        for( i = 0 ;i<len;i++)
        {
            if(dis1[i]==-1 || dis2[i]==-1)
            continue;
            if(mini > Math.max(dis1[i],dis2[i]))
            {
                mini= Math.max(dis1[i],dis2[i]) ;
            res = i ;
            }
        }
        return res ;
    }
}
