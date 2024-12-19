class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
        //add-first
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //add-last
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next!=null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        //print
        public void printList(){
            Node currNode = head;
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            while(currNode!=null){
                System.out.println(currNode.data+"-->");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.printList();
    }
}