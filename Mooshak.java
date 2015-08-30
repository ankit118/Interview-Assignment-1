
public class Mooshak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,1,0,1},{0,0,1,1},{1,9,1,0},{1,1,1,1}};
		int[][] result = new int[grid.length][grid[0].length];
		System.out.println(mouse(grid, result, 0 , 0));
	}
	public static boolean mouse(int[][] grid, int[][] result, int m, int n){
		if(grid[m][n] == 9)
			return true;
		result[m][n] = 1;
		boolean a = false,b = false,c = false,d = false;
		if(m+1<grid.length && grid[m+1][n]!=0 && result[m+1][n] !=1)
			a=mouse(grid,result,m+1,n);
		if(n+1<grid[0].length && grid[m][n+1]!=0 && result[m][n+1] !=1)
			b=mouse(grid,result,m,n+1);
		if(m-1>=0 && grid[m-1][n]!=0 && result[m-1][n] !=1)
			c=mouse(grid,result,m-1,n);
		if(n-1>=0 && grid[m][n-1]!=0 && result[m][n-1] !=1)
			d=mouse(grid,result,m,n-1);
		return a||b||c||d;
	}
}
