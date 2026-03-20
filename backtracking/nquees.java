package backtracking;

public class nquees {
    public static void main(String args[])
    {
        int n = 4;
        char board[][] = new char[n][n];
        //initialize board
        for(int row = 0;row<board.length;row++){
            for(int col = 0;col<board.length;col++) 
               board[row][col] = 'x';
        }
        nQueens(board,0); // 0 is row
    }
    public static void printBoard(char board[][])
    {
        System.out.println("-----chess board-----");
        for(int row = 0;row<board.length;row++){
            for(int j = 0;j<board.length ; j++)
                System.out.print(board[row][j]+" ");
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col)
    {
        //vertical check
        for(int r = row-1;r >=0 ; r--){
            if(board[r][col] == 'Q')
                return false;
        }
        //right diagonal check
        for(int r = row-1, c = col+1 ; r>=0 && c<board.length  ;r--,c++){
            if(board[r][c] == 'Q')
                return false;
        }
        //left diagonal check
        for(int i=row-1, j = col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    public static void nQueens(char board[][],int row)
    {
        //base case using row kyuki saara operation row ke saath ho rha isiliye
        if(row == board.length)
        {
            printBoard(board);
            return;
        }
        //recursive backtracking call 
        for(int col = 0;col<board.length;col++){
            if(isSafe(board,row,col) == true)
            {
                board[row][col] = 'Q'; //place the queen
                nQueens(board,row+1); //call fornext row+1 kyuki voh row mei raani baith chuki hai 
                board[row][col] = 'x'; //backtrack and remove the queen
            }
        }
    }
}
