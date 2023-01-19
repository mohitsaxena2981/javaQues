
public class Main
{
    static int count=0;
    public static void printans(char board[][])
    {
        for (int x=0;x<4 ;x++ )
        {
            for(int y=0;y<4;y++)
            {
               System.out.print(board[x][y]+" ");
            }
            System.out.println();
        }
        System.out.println("chess");
    }
    public static boolean isSafe(char board[][],int row,int col)
    {
        // for up
        for(int x=row-1;x>=0;x--)
        {
            if(board[x][col]=='Q')
            {
                return false;
            }
        }
        
        // for diagonal left
        for(int x=row-1 , y=col-1;x>=0 && y>=0;x--,y--)
        {
            if(board[x][y]=='Q')
            {
                return false;
            }
        }
        
        // for diagonal right
        for(int x=row-1, y=col+1;x>=0 && y<board.length;x--,y++)
        {
            if(board[x][y]=='Q')
            {
                return false;
            }
        }
        return true;
        
    }
    public static void nqueens(char board[][],int row)
    {
        if(row==board.length)
        {
            count++;
            return;
        }
        
        for(int x=0;x<board.length;x++)
        {
            if(isSafe(board,row,x)==true)
            {
                board[row][x]='Q';
                nqueens(board,row+1);
                board[row][x]='x';
            }
            
        }
    }
    public static void main (String[] args) {
        char board[][]=new char[4][4];
        for (int x=0;x<4 ;x++ )
        {
            for(int y=0;y<4;y++)
            {
                board[x][y]='x';
            }
        }
        nqueens(board,0);
        System.out.println(count);
    }
}



