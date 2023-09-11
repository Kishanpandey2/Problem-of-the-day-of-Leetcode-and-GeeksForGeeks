// BruteForce solution with O(n^2) complexity 
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
         List<List<Integer>> ans = new ArrayList<>() ;

            int n = groupSizes.length ;
        for(int  i = 0;i<n;i++){
            
            int size = groupSizes[i] ;

            if(size>0){
                List<Integer> temp = new ArrayList<>() ;

                for(int j = 0 ;j<n && temp.size()<size;j++){
                    if(groupSizes[j]==size)
                    {
                        temp.add(j) ;
                        groupSizes[j]= 0;
                    }
                }
                if(temp.size()>0)
                ans.add(temp);
            }
           
        }

        return ans;
    }
}

// Efficient solution using HashMap  with O(n)
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
               List<List<Integer>> ans = new ArrayList<>() ;
               Map<Integer,List<Integer>>map = new HashMap<>() ;
                int n = groupSizes.length ;
               for(int i= 0 ;i<n ;i++){
                int size = groupSizes[i] ;
                List<Integer>temp = map.getOrDefault(size,new ArrayList<>()) ;
                temp.add(i) ;

                map.put(size,temp) ;

                if(temp.size()==size)
                {
                    ans.add(temp) ;
                    map.remove(size);
                }
               }

               return ans;
    }
}
