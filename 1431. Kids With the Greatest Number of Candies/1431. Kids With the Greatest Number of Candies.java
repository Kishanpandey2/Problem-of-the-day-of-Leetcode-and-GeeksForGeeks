class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandi = Integer.MIN_VALUE ;
        for(int i : candies){
            maxCandi = Math.max(i,maxCandi) ;
        }
List<Boolean> ans = new ArrayList<>();
        for(int i : candies){
            if((i+extraCandies)>=maxCandi)
            ans.add(true) ;
            else
            ans.add(false);
        }
        return ans; 
    }
}
