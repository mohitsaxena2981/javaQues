// grid path || unique path
// time complexity --- 2^(n+m)

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

