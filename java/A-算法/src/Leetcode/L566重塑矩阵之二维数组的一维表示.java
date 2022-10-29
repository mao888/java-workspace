package Leetcode;

public class L566重塑矩阵之二维数组的一维表示 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2},{3,4}};
	}
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int m = mat.length;
		int n = mat[0].length;
		if (m*n!=r*c) {
			return mat;
		}
		
		int arr[][] = new int [r][c];
		for (int i = 0; i < m*n; i++) {
			arr[i/c][i%c] = mat[i/n][i%n];
		}
		return arr;
	}
	
}
