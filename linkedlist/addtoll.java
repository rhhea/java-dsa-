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
    public static int size;
    //add first method
    public  void addFirst(int data){
        //create a node  first
        Node newnode = new Node(data);
        size++;
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
        size++;
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
            System.out.print(temp.data + "->");
            temp = temp.ref;
        }
        System.out.print(temp.data);
    }
    //add in the middle method
    public void addMiddle(int index,int data){
        //create a node
        Node newnode = new Node(data);
        size++;
        //special case
        if(index == 0){
            addFirst(data);
            return;
        }
        //traverse through the given index 
        Node temp = head;
        int i = 0;
        while(i != index-1){
            temp = temp.ref;
            i++;
        }
        //once you reach the desired index
        newnode.ref = temp.ref;
        temp.ref = newnode;
        System.out.println("node added successfully at index " + index);
    }

    //remove first in LL method
    public int removeFirst(){
        if(head == null){
            System.out.println("No elements in the LL");
            return -1;
        }
        if(size == 1){
            int val = head.data;
            head= tail = null;
            size--;
            return val;
        }
        size--;
        int val = head.data;
        head = head.ref;
        return val;
    }

    //remove last 
    public int removeLast(){
        if(head == null){
            System.out.println("no elements  in the LL to delete");
            return -1;
        }
        if(size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node prev = head;
        int  i = 0;
        while(i < size-2){
            prev = prev.ref;
            i++;
        }
        prev.ref = null;
        tail = prev;
        size--;
        return val;
    }

    //iterative search
    public int iterativeSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key) //key found
                return i;
            i++;
            temp = temp.ref;
        }
        return -1; //not found 
    }

    //recursive search method 
    public int recursiveSearch(int key,Node head){
         //not found base casee 
        if(head == null) //head.ref == null && head.data != key
            return -1;
        //key found
        if(head.data == key){
            return 0;
        }
        //kaam
        int index = recursiveSearch(key, head.ref);
        if(index == -1)
            return -1;
        return index+1;
    }
    //main function 
    public static void main(String args[]){
        addtoll ll = new addtoll();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(30);
        ll.addLast(40);
        ll.addMiddle(1, 15);
        System.out.println("Linked List created successfully");
        ll.printll(head, tail);
        System.out.println();
        System.out.println("Deleted element: "+ll.removeFirst());
        System.out.println("Size of LL: "+size);
        ll.printll(head, tail);
        System.out.println();
        System.out.println("Element deleted from last "+ ll.removeLast());
        ll.printll(head,tail);
        System.out.println();
        System.out.println("Element found at position " + ll.iterativeSearch(20));
        System.out.println("Element found at position " + ll.recursiveSearch(20,head));

    }
}
