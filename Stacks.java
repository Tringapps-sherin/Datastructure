public class Stacks{
    int arr[]=new int[5];
    int top=0;
    //push function,it will push the value to the array
    public void push(int data)
    {
      arr[top]=data;
      top++;
    }
    //pop function,it will get the element from the array in last-in-first-out manner
    public int pop()
    {
        int data;
        top--;
        data=arr[top];
        arr[top]=0;
        return data;
    }
    //peek function,it will keep the value of the particular array element
    public int peek()
    {
        int data;
        data=arr[top-1];
        return data;
    }
    //returns the size of the array
    public int size()
    {
        return top;
    }
    //returns true if the array is empty or else will return false
    public boolean isEmpty()
    {
        return top<=0;
    }
    //show the elements in an array
    public void show()
    {
        for(int n:arr)
        {
            System.out.println(n+" ");
        }
    }
    public static void main(String args[])
    {
        Stacks obj=new Stacks();
        System.out.println("empty:"+obj.isEmpty());
        obj.push(5);
        obj.push(4);
        System.out.println(obj.peek());
        obj.push(3);
        obj.push(2);
        obj.push(1);
        System.out.println("the popped element is:"+ obj.pop());
        System.out.println("the size of the array is:"+obj.size());
        System.out.println("empty:"+obj.isEmpty());
    
        
        
        obj.show();
    }

}