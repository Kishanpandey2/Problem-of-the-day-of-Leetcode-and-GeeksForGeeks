class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        for(int i = n/2 -1 ;i>=0;i--)
        heapify(arr,n,i);
        
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        int largest = i ;
        int left = 2*i+1 ;
        int right = 2*i+2 ;
        
        if(left<n  && arr[left]>arr[largest])
        largest = left;
        
         if(right<n  && arr[right]>arr[largest])
        largest = right;
        
        if(largest!=i)
        {
            swap(arr,largest,i);
            heapify(arr,n,largest);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        buildHeap(arr,n);
        for(int i = n-1;i>=0;i--)
        {
            swap(arr,0,i);
            heapify(arr,i,0);
        }
    }
    
    public void swap(int []a,int i,int j)
    {
        int t = a[i] ; a[i] = a[j] ; a[j] = t;
    }
 }
 
