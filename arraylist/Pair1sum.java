package arraylist;
import java.util.*;
public class Pair1sum {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(brute(list,6));
        System.out.println(twopointer(list,50));
    }
    public static boolean brute(ArrayList<Integer> h,int target){
        for(int i=0;i<h.size()-1;i++){
            for(int j=i+1;j<h.size();j++){
                if(h.get(i) + h.get(j) == target)
                    return true;
            }
        }
        return false;
    }
    public static boolean twopointer(ArrayList<Integer> li,int target){
        int i=0,j=li.size()-1;
        while(i<j){
            //calcualte sum at current level
            if(li.get(i)+li.get(j) == target)
                return true;
            //update pointers
            if(li.get(i)+li.get(j) > target)
                j--;
            else 
                i++;
        }
        return false;
    }
}
