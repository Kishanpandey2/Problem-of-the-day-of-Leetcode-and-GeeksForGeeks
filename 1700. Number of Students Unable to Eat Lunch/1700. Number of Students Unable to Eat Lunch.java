class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
    int freq[]  = new int[2];
        int cnt = 0 ;
        for(int  i : students)
        freq[i]++ ;

     for(int i : sandwiches){
           if(freq[i]>=1)
           {
            cnt++ ;
            freq[i]--;
           }
           else break;
     }   

     return cnt == students.length ? 0 : students.length-cnt;
    }
}
