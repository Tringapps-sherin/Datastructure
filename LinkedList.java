
class Node{
    int data;
    Node next;
}
public class LinkedList {
    int data;//points to the data part
    Node next;//points to the address
    Node head;
    //insert function,which inserts the value to the node
    public void insert(int data) {
       Node node1=new Node();
       node1.data=data;
       node1.next=null;
       if(head==null)
       {
           head=node1;
       }
       else
       {
           Node n=head;
           while(n.next!=null)
           {
               n=n.next;
           }
           n.next=node1;
       }
    }
    //insertAtStart function, which inserts the value at the beginning of the node
    public void insertAtStart(int data){
        Node node1=new Node();
        node1.data=data;
        node1.next=null;
        node1.next=head;
        head=node1; 
    }
    //insertAt function,which inserts the value at the particular index
    public void insertAt(int index,int data)
    {
       Node node1=new Node();
       node1.data=data;
       node1.next=null;
       if(index==0)
      {
        insertAtStart(data);
      }
       Node n=head;
       for(int i=0;i<index-1;i++)
       {
           n=n.next;
       }
       node1.next=n.next;
       n.next=node1;
    }
    //funtion which search the element present in the list or not.
    public boolean search(int data)
    {
        Node node3=head;//traversing the list
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else{
            while(node3!=null)
            {
                if(node3.data==data)
                {
                   return true;
                }

                 node3=node3.next;
            }
        }
        return false;

    }
    
    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }else{
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("the deleted element is:"+n1.data);
        }
    }
    //show function,which shows all the nodes 
    public void show()
    {
        Node n1=head;
        while(n1.next!=null)
        {
            System.out.println(n1.data);
            n1=n1.next;
        }
        System.out.println(n1.data);
    } 
    
       public static void main(String args[]){
        LinkedList obj=new LinkedList();
        obj.insert(2);
        obj.insert(4);
        obj.insert(6);
        obj.insertAtStart(10);
        obj.insertAt(3, 30);
        boolean searched=obj.search(6);
        if(searched)
        {
            System.out.println("the searched element is present in the list");
        }
        else{
            System.out.println("the element is not present in the list");
        }
        obj.deleteAt(1);
        obj.show();
       
    }
}
