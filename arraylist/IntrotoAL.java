package arraylist;

import java.util.ArrayList;
public class IntrotoAL {
    public static void main(String ardgs[]){
        ArrayList<Integer> list = new ArrayList<>();
        //operations
        list.add(1);
        list.add(2);
        list.add(3);
        //another variation 
        list.add(3,4);
        System.out.println(list);
        //to rermove an element
        list.remove(3);
        System.out.println(list);
        //to get an element
        System.out.println(list.get(1));
        //to set an element
        list.set(1,10);
        System.out.println(list);
        //to check whteher an element exist or  not
        System.out.println(list.contains(30));
        list.add(3,40);
        list.add(4,50);
        reverse(list);
        max(list);
        swap(list,1,3);
    }
    public static void reverse(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void max(ArrayList<Integer> li){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<li.size();i++)
            max = Math.max(max,li.get(i));
        System.out.println("\n"+max);
    }
    public static void swap(ArrayList<Integer> li,int i1,int i2){
        int temp = li.get(i1);
        li.set(i1,li.get(i2));
        li.set(i2,temp);
        System.out.println(li);
    }
}
