package arraylist;
import java.util.*;
public class Pair2sum {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(16);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(twopointer(list,55));
    }
    public static boolean twopointer(ArrayList<Integer> li,int target){
        int lp = 0,rp = 0,n = li.size();
        //calculate breaking point
        for(int i=0;i<li.size();i++){
            if(li.get(i)>li.get(i+1)){
                rp = i;
                lp = i+1;
                break;
            }
        }
        //looping
        while(lp != rp){
            //calculate at current level
            if(li.get(lp)+li.get(rp) == target)
                return true;
            //updating pointers
            if(li.get(lp)+li.get(rp) > target)
                rp = (n+rp-1)%n;
            else 
                lp = (lp+1) % n;
        }
        return false;
    }
}
