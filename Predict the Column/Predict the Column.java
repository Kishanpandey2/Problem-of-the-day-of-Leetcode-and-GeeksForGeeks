
class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int zeroCnt = 0;
       int col = -1 ;
       for(int i = 0 ;i<N;i++){
           int cnt = 0 ;
           for(int j = 0 ;j<N;j++){
               if(arr[j][i]==0)
               cnt++;
           }
           if(cnt>zeroCnt)
           {
               zeroCnt = cnt ;
               col = i;
           }
       }
       
       return col;
    }
}
