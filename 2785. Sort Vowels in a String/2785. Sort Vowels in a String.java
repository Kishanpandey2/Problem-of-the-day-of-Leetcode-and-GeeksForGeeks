class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>vowels = new ArrayList<>() ;
        List<Integer>positions = new ArrayList<>();
         
         char ans[] = s.toCharArray() ;
         
        for( int i = 0 ;i<s.length();i++  ){
            char ch = s.charAt(i) ;

             if(ch =='a' || ch =='e'|| ch == 'i' || ch == 'o'|| ch =='u' ||ch =='A' || ch =='E'|| ch == 'I' || ch == 'O'|| ch =='U')
           {
               vowels.add(ch) ;
                positions.add(i) ;
           }
        }
        Collections.sort(vowels);
         
        for(int i = 0 ;i<positions.size();i++ ){
            ans[positions.get(i)] = vowels.get(i);

           }
        return new String(ans);
    }
}
