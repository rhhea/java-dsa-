package linkedlist;
import java.util.LinkedList;
public class javaCollectionforLL {
    public static void main(String[] args) {
        //createe
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addFirst(10);
        ll.addFirst(5);
        ll.addLast(15);
        System.out.println(ll);
        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
