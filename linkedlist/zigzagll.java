package linkedlist;

public class zigzagll {
    //node class
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
    //getmid method
    public Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //reverse method
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    //zigzagmethod
    public void zigzag(Node head){
        //step-1: get mid
        Node mid = getmid(head);
        //step-2: reverse second half
        Node rh = reverse(mid.next);
        mid.next = null;
        //step-3: merge zigzag
        Node lh = head;
        Node nextl,nextr;
        while(lh != null && rh != null){
            //zigzag code 
            nextl = lh.next;
            nextr = rh.next;
            lh.next = rh;
            rh.next = nextl;
            //update
            lh = nextl;
            rh = nextr;
        }
    }
    //main method 
    public static void main(String args[]){
        zigzagll ll = new zigzagll();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        System.out.println("Before zigzag: ");
        ll.printll();
        System.out.println("\nAfter zigzag: ");
        ll.zigzag(head);
        ll.printll();

    }
}
