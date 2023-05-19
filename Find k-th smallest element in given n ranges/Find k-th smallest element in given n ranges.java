class Interval
    {
    	int a;
    	int b;
    	public Interval(int a,int b)
    	{
    	    this.a=a;
    	    this.b=b;
    	}
    }

class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        // code here
        
        //store the points in custom data structure
       Interval arr[]=new Interval[n];
        for(int i=0;i<n ; i++){
           arr[i] = new Interval(range[i][0],range[i][1]);
        }
        //pt till the intervals are merged.
         int index = mergeIntervals(arr);
         
          ArrayList<Integer> ans=new ArrayList<>();
           for(int i = 0 ; i < queries.length; i++){
            int res = find_kth(arr, queries[i], index);
            ans.add(res);
           }
        
          return ans;   
    }
    
        static int find_kth(Interval arr[], int k, int index){
        int ans=-1;
         for (int j = 0; j <=index; j++)
        {
            if (k <= Math.abs(arr[j].b - arr[j].a + 1)){
                ans = (arr[j].a + k - 1);
                break;
            }
 
            k = k - Math.abs(arr[j].b - arr[j].a + 1);
        }
        return ans;
        
    }
    
    static int  mergeIntervals(Interval arr[])
	{
	   ArrayList<Interval> al=new ArrayList<>();
	    Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.a - i2.a;
            }
        });
   
        int index = 0;
       
        for (int i=1; i<arr.length; i++)
        {
            if (arr[index].b >=  arr[i].a)
            {
                arr[index].b = Math.max(arr[index].b, arr[i].b);
            }
            else {
                index++;
                arr[index] = arr[i];
            }   
        }
         
        
        return index;
	}
}
        
