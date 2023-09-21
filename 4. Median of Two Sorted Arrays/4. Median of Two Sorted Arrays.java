class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length , m = nums2.length;
        int []ans = new int[n + m] ;
        
        if(n + m == 0 )return 0.0 ;
       int  i= 0 , j= 0 , k = 0  ;
        while(i<n && j<m){
            if(nums1[i]<nums2[j])
            {
                ans[k++] = nums1[i++] ; 
            }
            else
            {
                ans[k++] = nums2[j++] ; 
            }
        }

        while(i<n ){
            ans[k++] = nums1[i++] ;
        }
          while(j<m ){
            ans[k++] = nums2[j++] ;
        }

        double median = 0.0 ;
        int mid = (n+m)/2 ;

        if(ans.length%2!=0)
        median = ans[mid] ;
        else
        {
          median = (ans[mid]+ans[mid-1] )/2.0;
        }


        return median;
    }
}
