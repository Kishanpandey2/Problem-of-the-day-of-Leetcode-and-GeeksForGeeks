// Brute force or Naive solution in O(n^2) 
class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
       Set<Integer>s1 ,s2;
       s1 = new HashSet<>() ; 
       s2 = new HashSet<>() ;
       ArrayList<Integer>ans = new ArrayList<>() ;
       for(int i = 0 ;i<N;i++){
           
           for(int j = i+1 ;j<N;j++){
               s2.add(A[j]) ;
           }
           ans.add(s1.size()-s2.size()) ;
           s2.clear();
           s1.add(A[i] ) ;
       }
       return ans ;
    }
}
    




// Efficient solution in O(n) using Map

class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
       Map<Integer,Integer>x ,y;
       x = new HashMap<>() ; 
       y = new HashMap<>() ;
       ArrayList<Integer>ans = new ArrayList<>() ;
       
       for(int i:A)
        y.put(i,y.getOrDefault(i,0)+1) ;  
        
        
       for(int i = 0 ;i<N;i++){
           
            y.put(A[i],y.get(A[i])-1) ;
            
            if(y.get(A[i])== 0)
            y.remove(A[i]) ;
            
            int curAns  = x.size() - y.size() ;
            ans.add(curAns);
             x.put(A[i],y.getOrDefault(A[i],0)+1) ;
       }
       return ans ;
    }
}
        
