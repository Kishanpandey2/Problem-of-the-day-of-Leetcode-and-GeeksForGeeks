class Solution {
    public int minDeletions(String s) {
        int freq[] = new int[26];
        int deletion = 0 ;

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }


        Set<Integer>uniqueFreq = new HashSet<>() ;

        for(int cnt: freq){
            while(cnt>0 && uniqueFreq.contains(cnt)){
                deletion++ ;
                cnt--;
            }
            uniqueFreq.add(cnt);
        }
        return deletion;
    }
}
