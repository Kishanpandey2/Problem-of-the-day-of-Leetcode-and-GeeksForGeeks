class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer>dq = new ArrayDeque<>() ;
        Arrays.sort(deck);

        int []ans = new int[deck.length];

        for(int i = 0 ;i<deck.length;i++)dq.add(i) ;

        int ind = 0 ;
        boolean flag  = true;

        while(!dq.isEmpty()){
            if(flag ){
                ans[dq.pollFirst()] = deck[ind++] ;
            }
            else
            {
                dq.addLast(dq.pollFirst()) ;
            }
            flag = !flag ;
            
        }

        return ans;
    }
}
