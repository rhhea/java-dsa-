package twodimarrays;
import java.util.*;
public class intro {
    public static void main(String args[])
    {
        int matrix[][] = new int[4][4];
        // Initializing the 2D array
        Scanner sc = new Scanner(System.in);
        for(int row = 0;row<4;row++){
            for(int col = 0;col<4;col++){
              //  System.out.print("Enter element for position [" + row + "][" + col + "]: ");
                matrix[row][col] = sc.nextInt();
            }
        }
        int max = matrix[0][0];
        int min = matrix[0][0];
        // Finding the maximum and minimum element
        //output
        for(int row = 0;row<4;row++){
            for(int col = 0;col<4;col++){
                System.out.print(matrix[row][col] + " ");
                max = Math.max(max,matrix[row][col]);
                min = Math.min(min,matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println("Maximum element: " + max + "Minimum element: " + min);
        // Searching for an element
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        System.out.println("Element found "+ search(matrix, target));
    }

    public static boolean  search(int matrix[][],int target){
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==target){
                    System.out.println("Element found at position: [" + row + "][" + col + "]");
                    return true;
                }
            }
        }
        return false;
    }
}
