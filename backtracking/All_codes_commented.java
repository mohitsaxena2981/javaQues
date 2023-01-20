/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//que1

/*
public class Main
{
    public static void changeArray(int arr[],int i,int val)
    {
        if(i==arr.length)
        {
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArray(arr,i+1,val+1);
        arr[i]-=2;
    }
    public static void printArr(int arr[])
    {
        for(int x=0;x<arr.length;x++)
        {
            System.out.println(arr[x]);
        }
    }
	public static void main(String[] args) {
	    int arr[]=new int[]{1,2,3,4,5};
	    changeArray(arr,0,1);
	    System.out.println("Hello World");
	    printArr(arr);
		
	}
}*/


// que2 subsets]

/*
public class Main{
    public static void main (String[] args) {
    String str="abc";
    subset(str,"",0);
    
    }
    public static void subset(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        
        char ch=str.charAt(i);
        subset(str,ans+ch,i+1);
        subset(str,ans,i+1);
    }
}*/


// que3 permutations

/*
public class Main
{
    public static void findpermutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        for(int x=0;x<str.length();x++)
        {
            char ch=str.charAt(x);
            findpermutation(str.substring(0,x)+str.substring(x+1),ans+ch);
        }
    }
    public static void main (String[] args) {
        String str="abc";
        findpermutation(str,"");
    }
}*/


// que4 N-Queens all sol


// Time Complexity -->  O(n!); --- 1 2   3   4 ------- n 
//                                   n n-1 n-2 n-3 ----- 1

/*
public class Main
{
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
            printans(board);
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
    }
}
*/

// nqueens one sol


/*
public class Main
{
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
    public static boolean nqueens(char board[][],int row)
    {
        if(row==board.length)
        {

            return true;
        }
        
        for(int x=0;x<board.length;x++)
        {
            if(isSafe(board,row,x)==true)
            {
                board[row][x]='Q';
                if(nqueens(board,row+1))
                {
                    return true;
                }
                board[row][x]='x';
            }
            
        }
        return false;
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
        if(nqueens(board,0))
        {
            
            System.out.println("Sol exist");
            printans(board);
            
        }
        else
        {
            System.out.println("No Sol Exist");
        }
    }
}

*/



// nqueens count Number


/*
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
*/



// grid path || unique path
// time complexity --- 2^(n+m)

/*
public class Main
{
    public static int gridPaths(int i,int j,int row,int col)
    {
        if(i==row-1 || j==col-1)
        {
            return 1;
        }
        if(i==row||j==col)
        {
            return 0;
        }
        int right=gridPaths(i,j+1,row,col);
        int down=gridPaths(i+1,j,row,col);
        
        return right+down;
    }
    public static void main (String[] args) {
        int n=3;
        int m=3;
       System.out.println(gridPaths(0,0,n,m));
    }
}

*/

// grid path in reduced time


/*
public class Main {
    public static int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        for (int i = 0; i < m; i ++){
            paths[i][0] = 1;
        }
        for (int j = 0; j < n; j ++){
            paths[0][j] = 1;
        }
        for (int i = 1; i < m ; i ++){
            for (int j = 1; j < n; j ++){
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }
        return paths[m-1][n-1];
    }
   public static void main(String args[])
   {
      System.out.println(uniquePaths(10,10));
   }
   
}

*/


// Valid Sudoko

/*
public class Main{
    public static boolean issafe(int sudoko[][],int row,int col,int digit)
    {
        // column
        for(int x=0;x<=8;x++)
        {
            if(sudoko[x][col]==digit)
            {
                return false;
            }
        }
        // row
        for(int x=0;x<=8;x++)
        {
            if(sudoko[row][x]==digit)
            {
                return false;
            }
        }
        
        // grid
        
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        
        for(int x=sr;x<sr+3;x++)
        {
            for(int y=sc;y<sc+3;y++)
            {
                if(sudoko[x][y]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean sudokoSolver(int sudoko[][],int row,int col)
    {
        if(row==9 && col==0)
        {
            return true;
        }
        int nextrow=row,nextcol=col+1;
        if(col+1==9)
        {
            nextrow=row+1;
            nextcol=0;
        }
        
        if(sudoko[row][col]!=0)
        {
            return sudokoSolver(sudoko,nextrow,nextcol);
        }
        for(int digit=1;digit<=9;digit++)
        {
            if(issafe(sudoko,row,col,digit))
            {
                sudoko[row][col]=digit;
                if(sudokoSolver(sudoko,nextrow,nextcol))
                {
                    return true;
                }
                sudoko[row][col]=0;
            }
        }
        return false;
    }
    
    public static void printsol(int sudoko[][])
    {
        for(int x=0;x<9;x++)
        {
            for(int y=0;y<9;y++)
            {
                System.out.print(sudoko[x][y]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String args[])
    {
        int sudoko[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        
        if(sudokoSolver(sudoko,0,0))
        {
            System.out.println("Sol exist");
            printsol(sudoko);
        }
        else
        {
            System.out.println("No sol");
        }
    }
    
    
}
*/

// PRACTISE QUES



/*
import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr.length;y++)
            {
                arr[x][y]=sc.nextInt();
            }
        }
        solveMaze(arr);
    }
    public static void printSol(int sol[][])
    {
        for(int x=0;x<sol.length;x++)
        {
            for(int y=0;y<sol.length;y++)
            {
               System.out.print(sol[x][y]);
            }
            System.out.println("");
        }
    }
    public static void solveMaze(int maze[][])
    {
        int sol[][]=new int[maze.length][maze.length];
        if(solveMazeUntil(maze,0,0,sol)==false)
        {
            System.out.println("Sol do not exist");
            return;
        }
        printSol(sol);
        return;
    }
    
    public static boolean isSafe(int maze[][],int x,int y)
    {
        return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
    }
    
    public static boolean solveMazeUntil(int maze[][],int x,int y,int sol[][])
    {
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1)
        {
            sol[x][y]=1;
            return true;
        }
        
        if(isSafe(maze,x,y))
        {
            if(sol[x][y]==1)
            {
                return false;
            }
            sol[x][y]=1;
            if(solveMazeUntil(maze,x+1,y,sol))
            {
                return true;
            }
            if(solveMazeUntil(maze,x,y+1,sol))
            {
                return true;
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }
}
*/

/*
public class Main{
    static String combo[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void findcombination(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        int pos=ch-'0';
        String key=combo[pos];
        for(int x=0;x<key.length();x++)
        {
            findcombination(str.substring(1),ans+key.charAt(x));
        }
    }
    public static void main (String[] args) {
        String str="23";
        findcombination(str,"");
    }
}

*/
