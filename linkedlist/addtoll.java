package linkedlist;

public class addtoll {
    public class Node{
        int data;
        Node ref;
        //constructors
        public Node(int data){
            this.data = data;
            this.ref = null;
        }
    }
    //declaring static referrence variables
    public static Node head;
    public static Node tail;

    //add first method
    public  void addFirst(int data){
        //create a node  first
        Node newnode = new Node(data);
        //check if it is the first element 
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.ref = head;
        head = newnode;
    }
    //addLast method
    public void addLast(int data){
        //create a node
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.ref = newnode;
        tail = newnode;
    }

    //print ll
    public void printll(Node head,Node tail){ //O(n)
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp.ref != null){
            System.out.print(temp.data + " ");
            temp = temp.ref;
        }
        System.out.print(temp.data);
    }
    //main function 
    public static void main(String args[]){
        addtoll ll = new addtoll();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);
        System.out.println("Linked List created successfully");
        ll.printll(head, tail);
    }
}
