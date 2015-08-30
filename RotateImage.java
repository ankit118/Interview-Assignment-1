
public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] result = rotate(grid,1);
	}
	public static int[][] rotate(int[][] grid, int n){
		int[][] result = new int[grid.length][grid[0].length];
		for(int i=0; i<grid[0].length; i++){
			for(int j=0; j<grid.length; j++){
				if(n==1)					// Rotate Right
					result[i][j] = grid[grid.length-1-j][i];
				if(n==0)					// Rotate Left
					result[i][j] = grid[j][grid[0].length-1-i];
			}
		}
		return result;
	}
}
