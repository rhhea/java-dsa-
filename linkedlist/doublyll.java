package linkedlist;

public class doublyll{

    public class Node {
        int data;
        Node prev;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    //declaring static reference variables
    public static Node head;
    public static Node tail;

    //add last method
    public static void addLast(int data){

    }
    //print ll method
    public void printll(Node head,Node tail){ //O(n)
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    //main method
    public static void main(String args[]){
        doublyll ll = new doublyll();
        //just for the commit to regain my streak yo 
        ll.printll();
    }
}