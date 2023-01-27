class Solution {
   Set<String> dict;
Set <String> formedWords;
public List<String> findAllConcatenatedWordsInADict(String[] words) {
    List<String> ans = new ArrayList<>();
    dict = new HashSet<>(Arrays.asList(words));
    formedWords = new HashSet<>();
    
    
    for(String word:words){
        if(canbeFormed(word)){
            ans.add(word);
        }
    }
    return ans;
}

public boolean canbeFormed(String s){
    if(formedWords.contains(s)) return true;
    
    for(int i = 1;i<s.length();i++){
        String s1 = s.substring(0,i);
        String s2 = s.substring(i);
        if(dict.contains(s1)){
            if(dict.contains(s2) || canbeFormed(s2)) {
                formedWords.add(s);
                return true;
            }
        }
    }
    return false;
}
}
