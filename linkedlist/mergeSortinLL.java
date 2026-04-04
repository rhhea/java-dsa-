package linkedlist;
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

    public Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node lefthead , Node righthead){
        Node mergell = new Node(-1); //temp merge ll 
        Node temp = mergell;

        while(lefthead != null && righthead != null){
            if(lefthead.data > righthead.data)
                {temp.next = righthead;
                 righthead = righthead.next;
                 temp = temp.next;
                }
            else{
                temp.next = lefthead;
                lefthead = lefthead.next;
                temp = temp.next;
            }
        }
        //copy remaining elements from both 
        while(lefthead != null){
            temp.next = lefthead;
            lefthead = lefthead.next;
            temp = temp.next;
        }
        while(righthead != null){
            temp.next = righthead;
            righthead = righthead.next;
            temp = temp.next;
        }

        //remove the -1 from the start 
        return mergell.next;
    }

    //mergesort method
    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null)
            return head;
        //find mid
        Node mid = getmid(head);

        //divide
        Node righth = mid.next;
        mid.next = null;
        Node newl = mergeSort(head); //left half
        Node newr = mergeSort(righth);

        //merge and return
        return merge(newl,newr);
    }

     //add last method 
    public void addLast(int data){
        //createe newnode
        Node newnode = new Node(data);
        //if first node  is added 
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    //print method
    public static void printll(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    //main method
    public static void main(String[] args) {
        mergeSortinLL ll =new mergeSortinLL();
        ll.addLast(45);
        ll.addLast(4);
        ll.addLast(50);
        ll.addLast(19);
        System.out.println("before merge sort: ");
        ll.printll();
        System.out.println("\nafter merge sort: ");
        head = ll.mergeSort(head);
        ll.printll();
        
    }
}
