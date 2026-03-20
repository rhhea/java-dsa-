package twodimarrays.practiceproblems;

public class countof7 {
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8}, {8,8,7}};
        int count = 0;
        for(int row = 0; row<matrix.length ; row++){
            for(int col = 0;col<matrix[0].length;col++){
                if(matrix[row][col]==7)
                    count++;
            }
        }
        System.out.println("Count of 7 is: "+count);
    }
    
}
