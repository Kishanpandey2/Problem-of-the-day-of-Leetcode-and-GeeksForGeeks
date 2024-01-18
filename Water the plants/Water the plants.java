class Solution
{
    int min_sprinklers(int gallery[], int n)
    {
       List<int[]> list = new ArrayList<>() ;
       for(int i = 0 ;i<n;i++){
           if(gallery[i]> -1)
           list.add(new int[]{i-gallery[i],i+gallery[i]}) ;
       }
       
       Collections.sort(list,(a,b)-> a[0]-b[0]) ;
       
       int ans =0 , i = 0 , target = 0 ;
       
       while(target<n){
           if(i == list.size() || list.get(i)[0]>target)return -1 ;
           
           int maxRange = list.get(i)[1] ;
           
           while((i+1)<list.size() && list.get(i+1)[0]<=target )
           {
               i++ ;
               maxRange = Math.max(maxRange , list.get(i)[1]) ;
           }
           
           if(maxRange < target)return -1 ;
           
           ans++ ;
           target = maxRange +1 ;
           i++;
       }
       
       
       return ans;
    }
}
