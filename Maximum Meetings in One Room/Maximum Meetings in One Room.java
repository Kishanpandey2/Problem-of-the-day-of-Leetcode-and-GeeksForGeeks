class Pair implements Comparable<Pair>
    {
        int st , end, ind ;
        Pair(int st,int end,int ind){
            this.st = st ;
            this.end  = end ;
            this.ind = ind ;
        }
        
    public    int compareTo(Pair a ){
            return this.end - a.end ;
        }
    }
class Solution {
    
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        Pair []temp = new Pair[N] ;
        
        for(int i = 0 ; i<N;i++){
            temp[i] = new Pair(S[i],F[i],i+1) ;
        }
        
        Arrays.sort(temp) ;
        
        int prevEndPoint = temp[0].end ;
        ArrayList<Integer>ans = new ArrayList<>() ;
        ans.add(temp[0].ind) ;
        
        for(int i = 1;i<N;i++){
            if(temp[i].st > prevEndPoint)
            {
                ans.add(temp[i].ind) ;
                prevEndPoint = temp[i].end ;
            }
        }
        
    Collections.sort(ans) ;
    return ans;
    }
}
        
