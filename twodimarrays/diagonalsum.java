package twodimarrays;

public class diagonalsum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Diagonal sum is "+diagmy(matrix));
        System.out.println("Diagonal sum is "+linearcomplexityds(matrix));
    }
    public static int diagmy(int matrix[][]){//using brute force approach also
                                             //extra addition of overlapping element is avoided using if else condition 
        int sum = 0;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(row==col)//primary diagonal
                    sum += matrix[row][col];
                else if(row+col == matrix.length -1)//secondary diagonal
                    sum += matrix[row][col];
            }
        }
        return sum;
    }
    public static int linearcomplexityds(int matrix[][]){
        int sum = 0;
        for(int i = 0;i<matrix.length;i++){
            //primary diagonal
            sum += matrix[i][i];
            if(i != matrix.length -1 -i)//secondary diagonal+if condition to avoid double counting of overlapping element
            //in case of odd length matrix
                sum += matrix[i][matrix.length -1 -i];
        }
        return sum;
    }
}
