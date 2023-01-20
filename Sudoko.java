
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
