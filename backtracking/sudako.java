package backtracking;
//functtion to complete sudako 
class sudako {
    public static void main(String args[]){
        int board[][] = {
            {5,3,0, 0,7,0, 0,0,0},
            {6,0,0, 1,9,5, 0,0,0},
            {0,9,8, 0,0,0, 0,6,0},

            {8,0,0, 0,6,0, 0,0,3},
            {4,0,0, 8,0,3, 0,0,1},
            {7,0,0, 0,2,0, 0,0,6},

            {0,6,0, 0,0,0, 2,8,0},
            {0,0,0, 4,1,9, 0,0,5},
            {0,0,0, 0,8,0, 0,7,9}
        };
        System.out.println(sudakoo(board,0,0));
        printboard(board);
    }
    public static boolean sudakoo(int board[][],int row,int col){
        //base case
        if(row == 9 && col == 0){
            return true;
        }
        //kaam
        int nextrow = row , nextcol = col +1;
        if(col+1 == 9){
            nextrow = row + 1;
            nextcol = 0;
        }
        //agar udhar digit baith hai toh bypass
        if(board[row][col] != 0)
            return sudakoo(board,nextrow,nextcol);
        //try all possible options
        for(int digit = 1;digit <= 9;digit++)
        {
            if(isSafe(board,row,col,digit)){
                board[row][col] = digit;
                if(sudakoo(board,nextrow,nextcol)){ //solution exists
                    return true;
                }
                board[row][col] = 0; //solution nahi hai toh backtrack
            }
        }
        return false;
    }
    public static boolean isSafe(int board[][],int row,int col,int digit)
    {
        //col check
        for(int r = 0;r<9;r++)
        {
            if(board[r][col] == digit)
                return false;
        }
        //row  check
        for(int c= 0;c<9; c++){
            if(board[row][c] == digit)
                return false;
        }
        //cell check
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr;i<sr+3;i++){
            for(int j = sc;j<sc+3;j++){
                if(board[i][j] == digit)
                    return false;
            }
        }
        return true;
    }
    public static void printboard(int board[][]){
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}