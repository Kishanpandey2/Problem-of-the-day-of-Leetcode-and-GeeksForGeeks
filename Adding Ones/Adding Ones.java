// Brute force solution 

class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
        for(int i = 0 ;i<k;i++)
        {
        for(int j = updates[i]-1;j<n;j++)
        a[j]+=1;
        }
        
        
    }
    
}

// Efficient solution


class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
        for(int i = 0 ;i<k;i++)
        {
           a[updates[i]-1]+=1 ;
        }
        int sum = 0 ;
        for(int i = 0 ;i<n;i++)
        {
            sum += a[i];
            a[i] = sum ;
        }
        
    }
    
}
