package linkedlist;

public class palindromell {
    //node class
    public class Node{
        int data;
        Node ref;

        //constructor
        public Node(int data){
            this.data = data;
            this.ref = null;
        }
    }

    //declaring static reference variables 
    public static Node head;
    public static Node tail;

    //add to last method 
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

    //slowfast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.ref != null){
            slow = slow.ref; //+1
            fast = fast.ref.ref; //+2
        }
        return slow;
    }

    //reverse method
    public Node reverse(Node head){
        Node prev= null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.ref;
            curr.ref = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    //palindrome method
    public boolean palindrome(Node head){
        //if  no or only one element in the ll
        if(head == null || head.ref == null) 
            return true;
        //first step - find mid element
        Node mid = findMid(head);
        //second step - reverse the second half
        Node right = reverse(mid);
        //third step - compare
        Node left = head;
        while(right != null){
            if(left.data != right.data)
                return false;
            left = left.ref;
            right = right.ref;
        }
        return true;
    }
    //main method
    public static void main(String args[]){
        palindromell ll = new palindromell();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(20);
        ll.addLast(10);
        ll.printll();
        System.out.println("\nPalindrome check: "+ ll.palindrome(head));
    }
}
