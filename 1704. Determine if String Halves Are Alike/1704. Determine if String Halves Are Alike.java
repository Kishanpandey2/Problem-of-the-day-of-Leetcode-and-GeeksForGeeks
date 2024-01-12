class Solution {
    public boolean halvesAreAlike(String s) {
      int vowels = 0 ;

      for(char ch : s.toCharArray())
      {
          if(ch == 'a' || ch== 'e'|| ch == 'E'||ch == 'A'|| ch=='i'|| ch=='I'|| ch =='o'|| ch == 'O' || ch=='u'|| ch == 'U')
          vowels++ ;
      }

      int l = 0  , r = s.length()-1;

        int leftVowels = 0 ;
      while(l<r)
      {
          char ch = s.charAt(l) ;
          
          if(ch == 'a' || ch== 'e'|| ch == 'E'||ch == 'A'|| ch=='i'|| ch=='I'|| ch =='o'|| ch == 'O' || ch=='u'|| ch == 'U')
         {
             leftVowels++ ;
             vowels--;
         }
         l++; r--;
      }

      return leftVowels == vowels ;

    }
}
