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


// In reduced time complexity

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
