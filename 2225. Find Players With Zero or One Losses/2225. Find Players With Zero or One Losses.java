class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>>ans = new ArrayList<>() ;
        Set<Integer>nonLoser  =  new HashSet<>() ;
        Set<Integer>losers  =  new HashSet<>() ;

        Map<Integer,Integer>losersCnt = new HashMap<>() ;

        for(int i[]: matches){
            losers.add(i[1]) ;

            int loscnt = losersCnt.getOrDefault(i[1],0) ;
            losersCnt.put(i[1],loscnt+1) ;
        }

        for(int i[]: matches){
            
            if(!losers.contains(i[0]))
            nonLoser.add(i[0]);
        }
        
        Set<Integer>losExactlyOne = new HashSet<>()  ;

        for(Map.Entry<Integer,Integer>entry : losersCnt.entrySet())
        {
            if(entry.getValue() ==1)
            losExactlyOne.add(entry.getKey()) ;
        }

        ArrayList<Integer>nonloser = new ArrayList<>(nonLoser);
        Collections.sort(nonloser) ;

         ArrayList<Integer>losexactlyone = new ArrayList<>(losExactlyOne);
        Collections.sort(losexactlyone) ;

        ans.add(nonloser);
        ans.add(losexactlyone);


        return ans ;


    }
}
