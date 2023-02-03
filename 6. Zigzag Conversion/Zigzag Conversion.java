class Solution {
    public String convert(String s, int numRows) {
        ArrayList<ArrayList<Character>>ch = new ArrayList<>() ;
        if(numRows<=1)
        return s ;
        for(int i = 0 ;i<numRows ;i++){
            ch.add(new ArrayList<>()) ;
        }
        int dir = 1, curRow = 0 ;
        for(char c: s.toCharArray()){
            ch.get(curRow).add(c);
           if(curRow==numRows-1){
               dir =-1 ;
           }
           else if(curRow==0)
           dir = 1 ;
           curRow += dir ;
       }
        StringBuilder sb = new StringBuilder() ;
        for(int i = 0 ;i<ch.size() ;i++){
            for(char c : ch.get(i)){
                sb.append(c) ;
            }
        }
        return sb.toString() ;
    }
}
Console
