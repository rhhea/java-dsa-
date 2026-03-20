package twodimarrays;

public class searchinsorteddmatrix {
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 33;
        System.out.println("Element found at index: "+search(matrix, key));
        System.out.println("Element found at index: "+search2(matrix, key));
    }
   public static boolean search(int matrix[][],int key){
    int row = 0;
    int col = matrix[0].length - 1; // start from top-right corner
    while(row<matrix.length && col >= 0){
        if(matrix[row][col] == key){
            System.out.print("Element found at ("+row+","+col+")"); 
            return true;
        }
        else if(matrix[row][col]>key)
        col--; // move left if current element is greater than key
        else
        row++; // move down if current element is less than key
    }
    return false;
   } 
   public static boolean search2(int matrix[][],int key){
    int row = matrix.length -1;//starting from lowest bottom element i.e.(n-1,0)
    int col = 0;
    while(row >= 0 && col < matrix[0].length){
        if(matrix[row][col]==key){
            System.out.print("Element found at ("+row+","+col+")");
            return true;
        }
        else if(key > matrix[row][col])
             col++; // move right if current element is less than key
        else
            row--; // move up if current element is greater than key
        }
        return false;
    }
   }

