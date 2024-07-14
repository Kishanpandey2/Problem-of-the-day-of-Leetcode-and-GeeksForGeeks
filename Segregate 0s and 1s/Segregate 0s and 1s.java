
class Solution {
    void segregate0and1(int[] arr) {
        int st = 0 ;
            
            for(int i = 0 ;i<arr.length;i++)
            {
                if(arr[i]==0)
                {swap(arr,st,i);
                    st++;
                }
            }
        
        }
        
        void swap(int []ar,int i,int j){
            int t= ar[i] ;
            ar[i] = ar[j];
            ar[j] = t;
        }
}
