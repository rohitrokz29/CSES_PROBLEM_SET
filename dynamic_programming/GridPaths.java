import java.util.*;

public class GridPaths{
    static int findWays(char[][] grid,int i,int j){
        if(grid[i][j]=='*') return 0;
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        int ans=0;
        if(i<grid.length-1){
            ans+=findWays(grid,i+1,j);
        }
        if(j<grid[0].length-1){
            ans+=findWays(grid,i,j+1);
        }
        return  ans;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        char [][] grid=new char[n][n];
        for(int i=0;i<n;i++){
            grid[i]=in.nextLine().toCharArray();
        }
        if(grid[n-1][n-1]=='*'){
            System.out.println(0);
            return;
        }
        //nxn bcz we are checking total of n-1 possiblites in each row ans the first row and colum would be set to the qvablit if block wrt * or .
        // also in rescurive soln base condition goes upto n-1,n-1 so dp[n-1+1][n-1+1]
        int [][]ways=new int[n][n];
        //at 0,0 if * no way to enter
        if(grid[0][0]=='.')ways[0][0]=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='*')ways[i][j]=0;
                else {
                    if(i>0)ways[i][j]+=ways[i-1][j];
                    if(j>0)ways[i][j]+=ways[i][j-1];
                }
                ways[i][j]%=(int)(1e9+7);
            }
        }
        System.out.println(ways[n-1][n-1]);
        in.close();
    }
}