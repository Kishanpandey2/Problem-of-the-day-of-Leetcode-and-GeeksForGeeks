class Pair implements Comparable<Pair>{
    int cost , quan ;
    
    Pair(int cost, int quan){
        this.cost = cost ;
        this.quan = quan ;
    }
    
    public int compareTo(Pair a){
        return this.cost - a.cost ;
    }
}
class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        ArrayList<Pair>al = new ArrayList<>() ;
        
        for(int i  = 0 ;i<n;i++){
            al.add(new Pair(price[i],i+1)) ;
        }
        
        Collections.sort(al) ;
        
        int ans = 0 ;
        
        for(int i = 0 ;i<n;i++){
            int unit = Math.min(al.get(i).quan, k/al.get(i).cost) ;
            
            ans += unit ;
            
            k -= (al.get(i).cost * unit) ;
        }
        
        return ans;
    }
}
