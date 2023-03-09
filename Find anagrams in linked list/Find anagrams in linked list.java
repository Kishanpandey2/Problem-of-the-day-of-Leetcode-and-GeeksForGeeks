class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        int n = s.length() ;
        int []ar = new int[26] ;
        
        for(int i = 0 ;i<n ;i++){
            ar[s.charAt(i)-'a']++ ;
        }
        
        int []freq = new int[26] ;
        
        Node p1 = head , p2 = head ,  prev = null ;
        
        for(int i = 0 ;i<n && p2 != null ;i++){
            freq[p2.data-'a']++ ;
            prev = p2 ;
            p2 = p2.next ;
        }
        
        p2 =  prev ;
        ArrayList<Node> al = new ArrayList<>() ;
        while(p2.next!= null){
            if(isEqual(ar,freq)){
                al.add(p1) ;Node t1 = p2 ;
                Node prev1  = null ;
                p2 = p2.next ;
                t1.next  = null ;
                
                p1 = p2 ;
                
                Arrays.fill(freq ,  0) ;
           for(int i = 0 ;i<n && p2 != null ;i++){
            freq[p2.data-'a']++ ;
            prev1 = p2 ;
            p2 = p2.next ;
        }
                p2 =  prev1 ;
            }
            
            else{
                freq[p1.data - 'a']-- ;
                p1 = p1.next ;
                p2 = p2.next ;
                freq[p2.data - 'a']++ ;
            }
        }
        
        if(isEqual(ar,freq))
        al.add(p1) ;
        
        return al ;
    }
    public static boolean isEqual(int []ar , int []freq){
        for(int i = 0 ;i<26 ;i++)
        {
            if(ar[i] != freq[i]) return false ;
        }
        return true ;
    }
}
