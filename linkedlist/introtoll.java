package linkedlist;

public class introtoll {
    public static class Node{
    int data;
    Node ref;

    //defining constructors 
    public  Node(int data){
        this.data = data;
        this.ref = null;
    }
}
    //Reference variables of type Node
    public static Node  head; //stores reference of the first node 
    public static Node tail;
    public static void main(String args[]){
        introtoll ll = new introtoll();
        //method 1 by defining data directly into the main fun instead go for method 2 by making methods for the same 
        ll.head = new Node(10);
        ll.head.ref = new  Node(20);
    }
}
