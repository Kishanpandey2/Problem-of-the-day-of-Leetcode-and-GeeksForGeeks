// Brute Force solution

class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        int cnt = 0 ;
        for(int i = 0 ;i<n;i++)
        {
            double x1 = (double)numerator[i]/denominator[i] ;
            for(int j = i+1 ;j<n;j++)
            {
                double x2 = (double)numerator[j]/denominator[j] ;
                
                if((x1+x2)==1)
                cnt++;
            }
        }
        return cnt;
    }
}


// Efficient solution 


class Solution {
    public static int countFractions(int n, int[] num, int[] denom) {
       int ans=0;
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=num[i],y=denom[i];
            int g=gcd(x,y);
            x/=g;  y/=g;
           
           int n_x = y-x; int n_y=y;
           //checking if 1-x/y is present in map - if yes -incerement the cnt;
            if(map.containsKey(n_x) && map.get(n_x).containsKey(y)){
                ans+=map.get(n_x).get(y);
            }
            //checking if some fractions have same num - push the denom in value(itself map)
            if(map.containsKey(x)){
                HashMap<Integer,Integer> hm =map.get(x);
                hm.put(y,hm.getOrDefault(y,0)+1);
                
            }
            //new fraction coming up.
            else{
                HashMap<Integer,Integer> hm=new HashMap<>();
                hm.put(y,1);
                map.put(x,hm);
            }
        }
        return ans;
    }
     static int gcd(int a,int b)
    {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
        
