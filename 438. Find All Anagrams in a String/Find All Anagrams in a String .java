class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()){
            return ans;
        }
        int[] fr1 = new int[26];
        int[] fr2 = new int[26];

        int k = p.length();

        for(char it : p.toCharArray()){
            fr1[it-'a']++;
        }

        int i = 0;

        while(i < k){
            fr2[s.charAt(i++)-'a']++;
        }

        k = s.length();
        int j = 0;

        if(Arrays.equals(fr1, fr2)){
            ans.add(j);
        }

        while(i < k){

            fr2[s.charAt(j++)-'a']--;
            fr2[s.charAt(i++)-'a']++;

            if(Arrays.equals(fr1, fr2)){
                ans.add(j);
            }
        }

        return ans;
    }
}
