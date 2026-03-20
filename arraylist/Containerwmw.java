package arraylist;
import java.util.*;
public class Containerwmw {
       public static  void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(brute(height));
        System.out.println(twopointer(height));
       }
       public static int brute(ArrayList<Integer> h){
        int max = 0;
        //using nested loops to form pairs
        for(int i=0;i<h.size()-1;i++){
            for(int j=i+1;j<h.size();j++)
            {
                //calculating height and width
                int height = Math.min(h.get(i), h.get(j));
                int width = j-i;
                max = Math.max(max,height*width);
            }
        }
        return max;
       }
       public static int twopointer(ArrayList<Integer> h){
        int max=0;
        //using 2 pointerr  approach
        int i=0 , j = h.size()-1;
        while(i<j){
            //calculate water for current pointers
            int height = Math.min(h.get(i),h.get(j));
            int width = j-i;
            max = Math.max(max,height*width);
            //updating pointers
            if(h.get(i)<h.get(j))
                i++;
            else 
                j--;
        }
        return max;
       }
}
