public class StackUsingLL {
    Node top;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    void push(int d){
        Node n = new Node(d);
        n.data = d;
        n.next = null;
        n.next = top;
        top = n;
    }
    void pop(){
        if(top==null)
        System.out.println("Stack is Empty");
        else{
            Node temp = top;
            top = top.next;
            temp.next = null;
            temp = null;
        }
    }
    void display(){
        if(top==null)
        System.out.println("Stack is Empty");
        else{
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        StackUsingLL stk = new StackUsingLL();
        stk.pop();
        stk.push(5);
        stk.push(4);
        stk.display();
    }
}
