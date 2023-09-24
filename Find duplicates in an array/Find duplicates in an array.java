// Method 1 

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer>al = new ArrayList<>() ;
             int []temp = new int[n] ;
        
        for(int i: arr)
        temp[i]++ ;
        
       for(int i = 0 ;i<n;i++)
       if(temp[i]>1)al.add(i) ;
       
         if(al.size() == 0)
        {
            al.add(-1) ; return al ;
        }
        
        return al  ;
    }
}


/// MEthod 2 


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer>al = new ArrayList<>() ;
        Map<Integer,Integer>map = new TreeMap<>() ;
        
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1) ;
        }
        
       
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
            al.add(entry.getKey()) ;
        }
        
         if(al.size() == 0)
        {
            al.add(-1) ; return al ;
        }
        
        return al  ;
    }
}
