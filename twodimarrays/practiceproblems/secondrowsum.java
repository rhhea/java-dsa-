package twodimarrays.practiceproblems;

public class secondrowsum {
    public static void main(String[] args) {
        int [][] matrix = { {1,4,9},{11,4,3},{2,2,3} };
        int sum = 0;
        for(int col = 0;col<matrix[1].length;col++)
            sum += matrix[1][col];
        System.out.println("Sum of second row is: " + sum);
    }
    
}
