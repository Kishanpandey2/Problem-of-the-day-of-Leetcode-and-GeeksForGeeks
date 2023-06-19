
class Solution
{
 
    static void arrange(long arr[], int n)
    {
        // your code here
        for(int i=0; i<n; i++){
            int nextIdx = (int)arr[i];
            if(nextIdx < i){
                arr[i] = (arr[nextIdx]%n)*n+arr[i];
            }else{
                arr[i] = arr[nextIdx]*n+arr[i];
            }
        }
        
        for(int i=0; i<n; i++){
            arr[i] = arr[i]/n;
        }
    }
}
