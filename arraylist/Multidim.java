package arraylist;
import java.util.*;
public class Multidim {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        //adding elements
        for(int i=1;i<6;i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
        }

        main.add(l1);
        main.add(l2);
        main.add(l3);

        System.out.println(main);
        //nested loop approach
        for(int i=0;i<main.size();i++){
            ArrayList<Integer> curr = main.get(i);
            for(int j = 0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }

        
    }
}
