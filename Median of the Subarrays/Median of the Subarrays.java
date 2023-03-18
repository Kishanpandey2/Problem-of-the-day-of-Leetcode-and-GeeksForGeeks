class Solution 
{ 
    long countSubarray(int N, int A[], int M) 
    { 
       long a = helpFunction(N,A,M);
        long b = helpFunction(N,A,M+1);
        return a-b;
    }
    long helpFunction(int n,int arr[],int m){
        int mm[] = new int[2*n+1];
        Arrays.fill(mm,0);
        long ans=0,currElement=0;
        int sum=n;
        mm[n]++;
        for(int i=0;i<n;i++){
            if(arr[i]<m){
                sum--;
                currElement-=mm[sum];
            }
            else{
                currElement+=mm[sum];
                sum++;
            }
            ans+=currElement;
            mm[sum]++;
        }
        return ans;
    }
} 
