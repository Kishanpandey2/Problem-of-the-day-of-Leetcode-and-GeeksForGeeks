
class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
     
    void push1(int x)
    {
     arr[++top1]=x ;
    }
   
    void push2(int x)
    {
       arr[--top2]= x;
    }
 
    int pop1()
    {
        if(top1==-1)
        return -1;
        return arr[top1--];
    }
     
    int pop2()
    {
        if(top2>=size)
        return -1;
        return arr[top2++];
    }
}

