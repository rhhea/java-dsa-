package linkedlist;
import java.util.LinkedList;
public class mergeSortinLL {
    public class Node{
        int data;
        Node next;

        //constructors
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //constant reference variables
    public static Node head;
    public static Node tail;


    //mergesort method
    public Node mergeSort(Node head){

        //find mid
        Node mid = getmid();

        //divide
        Node righth = mid.next;
        mid.next = null;
        Node newl = mergeSort(head); //left half
        Node newr = mergeSort(righth);

        //merge and return
        return merge(newl,newr);
    }
    //main method
    public static void main(String[] args) {
        
    }
}
