class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int cnt[] = new int[3] ;
        for(Node cur = head ; cur!= null  ;cur = cur.next){
            if(cur.data == 0)
            cnt[0]++ ;
            else if(cur.data ==1)
            cnt[1]++;
            else
            cnt[2]++;
        }
        Node cur = head;
        int index =  0;
        while(cur!=null)
        {
            if(cnt[index]==0)
            index++;
            
            if(cnt[index]!=0)
            {
                cur.data = index ;
                cnt[index]--;
                cur = cur.next ;
            }
        }
        return head;
    }
}

