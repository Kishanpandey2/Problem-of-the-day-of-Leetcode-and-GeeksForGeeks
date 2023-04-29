class Solution
{
    public long findNumber(long N)
    {
       
		String s="";
        long ans=0;
         int a[] = {1,3,5,7,9};
         while(N>0)
         {
            
             long curr = N%5;
             if(curr==0) s=a[4]+s;
             else s=a[(int)curr-1]+s;
             
             
             if(N%5==0 && N>0)
             N=N/5-1;
             
             else
             N=N/5;
         }
         return  Long.parseLong(s);
    }
}
