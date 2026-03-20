package twodimarrays;

public class spiral {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        spiralprint(matrix);
    }
    public static void spiralprint(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){//j for column
                System.out.print(matrix[startrow][j] + " ");
                //startcol++;
            }
            //right
            for(int i =startrow+1 ;i<=endrow;i++){//i for row
                System.out.print(matrix[i][endcol] + " ");
               // startrow++;
            }
            //bottom
            if (startrow < endrow){//to avoid printing duplicate row
            for(int j = endcol-1;j>=startcol;j--){//j for column
                System.out.print(matrix[endrow][j] + " ");
               // endcol--;
            }}
            //left
            if (startcol < endcol){//to avoid printing duplicate column
            for(int i = endrow-1;i>startrow;i--){//i for row
                System.out.print(matrix[i][startcol] + " ");
               // endrow--;
            }}
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
}
