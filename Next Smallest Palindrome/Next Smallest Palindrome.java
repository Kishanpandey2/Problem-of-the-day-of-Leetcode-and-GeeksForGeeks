
class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        Vector<Integer> ans = new Vector<>() ;
        
        int i , j , carry, flag = 0 ;
        
        for( i = n/2 ;i<n;i++)
        {
            if(num[i]<num[n-i-1]){
                num[i] = num[n-i-1] ;
                for( j = i+1 ;j<n;j++)
                num[j] = num[n-j-1];
                
                flag = 1 ; break;
            }
            
            else  if(num[i]>num[n-i-1])
            break;
        }
        
       
        
        if(flag == 1)
        {
            for(int no : num)
            ans.add(no) ;
            
            return ans;
        }
        else
        {
            carry = 1;
            for( i = (n-1)/2;i>=0;i--)
            {
                if(num[i]+carry == 10)
                {
                    num[i] = 0 ;
                    carry = 1;
                }
                else
                {
                    num[i]++;
                    carry = 0; break;
                }
            }
        }
        
        if(carry == 1)
        ans.add(1);
        
        for(int no : num)
            ans.add(no) ;
            
            if(carry == 1)
            n++;
            
            for( i = (n+1)/2 ;i<n;i++)
            {
                ans.set(i,ans.get(n-i-1));
            }
            
            return ans;
    }
}
