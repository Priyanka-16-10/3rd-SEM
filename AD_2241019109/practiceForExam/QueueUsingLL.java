public class QueueUsingLL {
    Node f,r;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    void enqueue(int d){
        Node n = new Node(d);
        n.data = d;
        n.next = null;
        if(f==null && r==null){
                f=r=n;
        }
        else{
                r.next = n;
                r = n;
        }
    }
    void dequeue(){
        if(f==null)
        System.out.println("Queue is Empty");
        else{
            System.out.println(f.data);
            if(f==r){
                f=r=null;
            }
            else{
                Node temp = f;
                f = f.next;
                temp.next = null;
                temp = null;
            }
        }
    }
    void display(){
        if(f==null)
        System.out.println("Q is Empty");
        else{
            System.out.println("After inserting ");
            Node temp = f;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueUsingLL stk = new QueueUsingLL();
        stk.dequeue();
        stk.display();
        stk.enqueue(5);
        stk.display();
        stk.enqueue(4);
        stk.display();
    }
}
