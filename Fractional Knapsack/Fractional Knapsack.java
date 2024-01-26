
/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class Element implements Comparable<Element>{
    int v,w;
    double r ;
    Element(int v,int w,double r){
        this.v = v ;
        this.w = w ;
        this.r = r;
    }
    
    public int compareTo(Element e)
    {
        if(this.r>e.r)return 1 ;
        else if(this.r < e.r)return -1 ;
        else return 0 ;
    }
}

class Solution
{
    
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        double ans = 0 ;
        Element el[] = new Element[n]; 
        
        for(int i = 0;i<n;i++)
        {
            double fr = (arr[i].value*1.0)/arr[i].weight ;
            
            el[i] = new Element(arr[i].value,arr[i].weight,fr) ;
        }
        
        Arrays.sort(el) ;
        
        for(int i = n-1;i>=0 ;i--){
            if(W==0)break ;
            if(el[i].w<=W)
            {
                ans += el[i].v ;
                W -= el[i].w ;
            }
            else{
                ans += ((double)el[i].v/el[i].w)*W ;
                W = 0  ;
                break ;
            }
        }
        
        return ans ;
    }
}







