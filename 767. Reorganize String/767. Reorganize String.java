class Solution {
    class Pair{
        char ch  ;
        int f ;
        Pair(char ch,int f){
            this.ch = ch ;
            this.f = f ;
        }
    }
    public String reorganizeString(String s) {
        int []map  = new int[26] ;
        for(char c : s.toCharArray()){
            map[c-'a']++;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> (b.f - a.f)) ;

        for(int i = 0 ;i<26;i++)
        {
            if(map[i]>0){
                pq.add(new Pair((char)('a'+i),map[i])) ;
            }
        }

        StringBuilder res = new StringBuilder() ;
      
        Pair block = pq.poll() ;
        res.append(block.ch);
        block.f--;

        while(pq.size()>0){
            Pair temp = pq.poll() ;
            res.append(temp.ch);
            temp.f--;

            if(block.f>0)
            pq.add(block);

            block = temp;
        }

            if(block.f>0)
            return "";

            
        return res.toString();
    }
}
