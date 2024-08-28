class Pair{
    int val ;
    int freq ;
    
    Pair(int val,int freq){
        this.val = val ;
        this.freq = freq;
    }
}
class Solution {
    
    public ArrayList<Integer> sortByFreq(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer>  ans = new ArrayList<>() ;
       ArrayList<Pair>  pq = new ArrayList<>() ;
        
        int cnt = 1 ;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]==arr[i-1])
            cnt++;
            else
            {
                Pair t = new Pair(arr[i-1],cnt);
                cnt = 1;
                pq.add(t);
            }
        }
        
        pq.add(new Pair(arr[arr.length-1],cnt));
        
        
        Collections.sort(pq,(a,b)-> b.freq-a.freq);
        
       for(Pair temp : pq){
         
            int data = temp.val ;
            int freq = temp.freq;
            
            while(freq-- >0){
                ans.add(data);
            }
            
        }
        
        return ans;
        
        
    }
}

