// Brute Force solution
class Solution {
    
    public void Rearrange(int a[], int n)
    {
      ArrayList<Integer>al = new ArrayList<>();
        
            for(int i: a){
                if(i<0)
               al.add(i);
            }
            for(int i: a){
                if(i>=0)
                al.add(i);
            }
           
         
         for(int i = 0 ;i<n;i++)
         {
            a[i] = al.get(i);
         }
    }
}
 
