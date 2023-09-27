// Brute Force solution 

class Solution{
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        ArrayList<Integer>ans = new ArrayList<>() ;
        int min = Integer.MAX_VALUE ;
        int r = 0 , c = 0 ;
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(Math.abs(x-(arr[i]+brr[j]))<min)
                {
                    min = Math.abs(x-(arr[i]+brr[j]));
                    r = i ; c = j ;
                }
            }
        }
        
        ans.add(arr[r]) ; ans.add(brr[c]) ;
        return ans;
    }
}

// Efficient soluion
class Solution{
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        ArrayList<Integer>ans = new ArrayList<>() ;
        int min = Integer.MAX_VALUE ;
        int r = 0 , c = 0 ;
        
        int l = 0 , h = m-1 ;
       while(l<n && h>=0){
                if(Math.abs(x-(arr[l]+brr[h]))<min)
                {
                    min = Math.abs(x-(arr[l]+brr[h]));
                    r = l ; c = h ;
                }
                if(arr[l]+brr[h]>x)
                h-- ;
                else
                l++ ;
            }
        
        ans.add(arr[r]) ; ans.add(brr[c]) ;
        return ans;
    }
}
