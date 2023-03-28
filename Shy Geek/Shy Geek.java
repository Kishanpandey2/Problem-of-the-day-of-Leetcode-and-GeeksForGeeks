class Solution{
    
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    static long find(int n, long k){
          int l = 0, h = n - 1;
        int count = 0;
      
        
         Map<Integer, Long> hm = new HashMap<>();
        while(k > 0)
        {
            l = 0;
            while(l <= h){
                int mid = l +(h-l)/2;
                long temp;
                
                if(hm.containsKey(mid))
                    temp = hm.get(mid);
                else
                    {
                        temp =shop.get(mid);
                         hm.put(mid, temp);
                    }
                
                if(temp <= k)
                    l = mid + 1;
                else 
                    h = mid - 1;
            }
            if(h == -1)
                break;
            count += (k/hm.get(h));
            
            k=  k%hm.get(h);
           
            
        }
        return count;
    }

}
