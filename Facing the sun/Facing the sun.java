
class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
      if(height.length ==1)return 1 ;
      int cnt = 1;
        int prevGrt = height[0];
        
      for(int i= 1;i<height.length;i++){
         if(height[i]>prevGrt)
         {
             cnt++;
             prevGrt = height[i];
         }
      }
      return cnt;
      
    }
}
