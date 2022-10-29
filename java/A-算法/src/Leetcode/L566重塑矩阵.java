package Leetcode;

import java.util.Iterator;

public class L566重塑矩阵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,2},{3,4}};
		System.out.println(new L566重塑矩阵().matrixReshape(mat, 1, 4));
	}
	
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    	int m = mat.length;
    	int n = mat[0].length;
    	if (m*n!=r*c) {
			return mat;
		}
    	int arr [] = new int [m*n];
    	int index =0;
    	// 转换为一维数组
    	for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[index] = mat[i][j];
				index++;
			}
		}
    	// 再将一维数组转换为目标数组
    	int temp[][]=new int[r][c];
    	for (int i = 0; i < r;i++) {
			for (int j = 0; j < c; j++) {
				temp[i][j] = arr[i*c+j];
			}
		}
    	return temp;
    }

}
