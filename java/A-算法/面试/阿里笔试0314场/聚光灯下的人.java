package 阿里笔试0314场;

import java.util.Scanner;

public class 聚光灯下的人 {

	 public static void main(String[] args) {
	        int ans = 0;
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[][] arr = new int[n][m];
	        int[][] rowCopy = new int[n][m];
	        int[][] colCopy = new int[n][m];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                arr[i][j] = sc.nextInt();
	                rowCopy[i][j] = arr[i][j];
	                colCopy[i][j] = arr[i][j];
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (i-1 >= 0) {
	                    colCopy[i][j] += colCopy[i-1][j];
	                }
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (j-1 >= 0){
	                    rowCopy[i][j] += rowCopy[i][j-1];
	                }
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (arr[i][j] == 0) {
	                    if (rowCopy[i][j] != 0) {
	                        ans++;
	                    }
	                    if (rowCopy[i][m-1] > rowCopy[i][j]){
	                        ans++;
	                    }
	                    if (colCopy[i][j] != 0) {
	                        ans++;
	                    }
	                    if (colCopy[n-1][j] > colCopy[i][j]){
	                        ans++;
	                    }
	                    System.out.println(ans);
	                }
	            }
	        }
	        System.out.println(ans);
	    }

}