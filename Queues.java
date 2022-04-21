class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class Queues{
   public Node rear=null,front=null;
   int count=0;
   //functions to add the element to the node
   public void enQueue(int data)
   {
       Node n1=new Node(data);
       System.out.println("inserting :"+data);
       if(front==null)
       {
           front=n1;
           rear=n1;
       }
       else{
           rear.next=n1;
           rear=n1;
       }
       //increases node count by 1 
       count+=1;
    }
    //function to remove the element from the node
    public int deQueue(){
        if(front==null)
        {
            System.out.println("queue is under flow");//if front is null it will print underflow
            System.exit(-1);
        }
        Node n2=front;//for traversing the nodes
        System.out.println("deleting :"+n2.data);
        front=front.next;
        if(front==null)
        {
            rear=null;

        }
        //decreases node count by 1
        count=count-1;
        return n2.data;
         }
         //utility function to return a top element in the queue
         public int peek()
         {
             if(front==null)
             {
                 System.exit(-1);
             }
             return front.data;
         }
         //function to check if the queue is empty ,if it is return true or else returns false
         public boolean isEmpty(){
             return rear==null && front==null;
         }
         //function to return the size of the queue
         public int size()
         {
             return count;
         }

    public static void main(String args[]){
        Queues obj=new Queues();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        System.out.println("the front element is:"+obj.peek());
        System.out.println("size of the queue is:"+obj.size());
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
        if(obj.isEmpty()){
            System.out.println("the queue is empty");
        }
        else{
            System.out.println("the queue is not empty");
        }
    }
}