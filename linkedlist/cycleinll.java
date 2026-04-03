package linkedlist;

public class cycleinll {
    public class Node{
        int data;
        Node ref;

        //constructors
        public Node(int data){
            this.data = data;
            this.ref = null;
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
        tail.ref = newnode;
        tail = newnode;
    }

    //print method
    public static void printll(){
        Node temp = head;
        while(temp.ref != null){
            System.out.print(temp.data + "->");
            temp = temp.ref;
        }
        System.out.print(temp.data);
    }
    //detecting a cycle using Floyd's method method
    public static boolean CycleLL(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.ref != null){
            slow = slow.ref;
            fast = fast.ref.ref;
            if(slow == fast)
                return true;
        }
        return false;
    }

    //remove cycle 
    public static void removecycle(){
        Node slow = head;
        Node fast =head;
        boolean cycle = false;
        //detect cycle
        while(fast != null && fast.ref != null){
            slow = slow.ref;
            fast = fast.ref.ref;
            if(slow == fast){
                cycle = true;
                break;
        }
    }
        if(cycle == false)
            return;
        //find meeting point
        // Case 1: cycle starts at head
        if(slow == fast){
            while(fast.ref != slow){
                fast = fast.ref;
            }
            fast.ref = null;
            tail = fast;
            return;
        }
        //case -2 : cycle starts somewhere 
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.ref;
            fast = fast.ref;
        }

        //change ref of the last node i.e. prev
        prev.ref = null;
        tail = prev;
    }
    //main method
    public static void main(String args[]){
        cycleinll ll = new cycleinll();
        ll.addLast(10);
        ll.addLast(20);
        Node temp = head.ref;
        ll.addLast(30);
        head.ref.ref.ref = temp;
        System.out.println("is there a cycle in ll: "+CycleLL());
        removecycle();
        System.out.println("is there a cycle in ll: "+CycleLL());
    }
}
