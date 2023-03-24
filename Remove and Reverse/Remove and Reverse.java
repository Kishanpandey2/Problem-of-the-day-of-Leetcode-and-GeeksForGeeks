class Solution 
{ 
    String removeReverse(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0, j=S.length()-1;
        boolean rev = false;
        HashSet<Integer> del = new HashSet<>();
        
        for(char ch : S.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        while(i<j){
            char first = S.charAt(i);
            char last = S.charAt(j);
            
            if(!rev){
                if(map.get(first) > 1){
                    map.put(first, map.get(first)-1);
                    del.add(i);
                    rev = !rev;
                }
                i++;
            } else {
                if(map.get(last) > 1){
                    map.put(last, map.get(last)-1);
                    del.add(j);
                    rev = !rev;
                }
                j--;
            }
        }
        StringBuilder ans = new StringBuilder();
        
        for(i=0; i<S.length(); i++){
            if(!del.contains(i)) ans.append(S.charAt(i));
        }
        if(rev) return ans.reverse().toString();
        
        return ans.toString();
    }
} 
