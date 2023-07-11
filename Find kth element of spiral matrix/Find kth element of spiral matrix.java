

class Solution
{   
    int findK(int A[][], int n, int m, int k)
    {
	 	 int layer=((Math.min(n,m))%2==0)?(Math.min(n,m)/2):((Math.min(n,m)/2)+1);
    int count=1;
    for(int i=0;i<layer;i++){
        //top
        for(int j=i;j<(m-i-1);j++){
            if(count==k) return A[i][j];
            count++;
        }
        //right
        for(int j=i;j<(n-i-1);j++){
            if(count==k) return A[j][m-i-1];
            count++;
        }
        
        //bottom
        for(int j=m-i-1;j>i;j--){
            if(count==k) return A[n-i-1][j];
            count++;
        }
        
        //left
        for(int j=n-1-i;j>i;j--){
            if(count==k) return A[j][i];
            count++;
        }
    }
    if(layer%2!=0){
        if(count==k) return A[layer-1][layer-1];
    }
 return 0;
    }
}
