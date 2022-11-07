package dataStructure.recursion;

public class BacktrackingChess {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queenPiece(board,0));
    }

    private static int queenPiece(boolean[][] board, int row) {
        if (row==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        //placing the queen and checking fo every row and col
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board,row,col))
            {
                board[row][col] = true;
                System.out.println("before");
                count+= queenPiece(board,row+1);
                System.out.println("after");
                board[row][col] = false;

            }
        }
        return count;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col])
            {
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        //diagonal left
        for (int i = 1; i <=maxLeft ; i++) {
            if (board[row-i][col-i])
            {
                return false;
            }
        }
        //diagonal right
        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 1; i <=maxRight ; i++) {
            if (board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row :board) {
            for (boolean element:row) {
                if (element)
                {
                    System.out.print(" Q ");
                }
                else {
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }
    }


}
