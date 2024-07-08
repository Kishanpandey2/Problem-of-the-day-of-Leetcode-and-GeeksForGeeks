
class Solution {
    int search(int[] arr, int key) {
         int l = 0 , h = arr.length-1 ;
         
         while(l<=h){
             int mid = l+(h-l)/2 ;
             
             if(arr[mid]==key)return mid;
             
             else if(arr[l]<=arr[mid]  ){
                if(key<=arr[mid] && key>=arr[l])         
                h = mid-1;
                else
                l = mid+1;
             }
             else 
             {
                if(key>=arr[mid] && key<=arr[h])         
                l = mid+1;
                else
                h = mid-1;
             }
             
         }
         
         
         return -1;
    }
}
