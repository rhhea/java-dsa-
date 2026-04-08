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

    //main method
    public static void main(String args[]){
        doublyll ll = new doublyll();
    }
}