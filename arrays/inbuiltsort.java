package arrays;
import java.util.Arrays;
import java.util.Collections;
// This program demonstrates the use of built-in sorting methods in Java.
public class inbuiltsort {
    public static void main(String args[])
    {
        int [] arr = {2,6,7,1,5,3};
        Arrays.sort(arr); // Using built-in sort method from Arrays class
        System.out.print("Sorted array: ");
        for(int i = 0;i<arr.length;i++)
        System.out.print("" + arr[i] + " ");
        int[] arr2 = {2,6,7,1,5,3};
        Arrays.sort(arr2, 0, 4); // Sorting a specific range of the array (from index 1 to 3i.e.,4xclusive)
        System.out.print("\nPartially sorted array: ");
        for(int i = 0;i<arr2.length;i++)
        System.out.print("" + arr2[i] + " ");
        Integer [] arr3 = {2,6,7,1,5,3};
        Arrays.sort(arr3, Collections.reverseOrder()); // Sorting in descending order
        System.out.print("\nSorted array in descending order: "); 
        for(int i = 0;i<arr3.length;i++)
        System.out.print("" + arr3[i] + " ");  
    }
}
