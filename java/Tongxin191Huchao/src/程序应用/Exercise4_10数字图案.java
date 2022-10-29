package 程序应用;

import java.util.Scanner;

public class Exercise4_10数字图案 {
		public static void main(String args[]) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int [][]arr = new int [a][a];
		int pen=1;
		for (int i = 0; i < arr.length; i++) {
			int x=i,y=0;
			while (x>=0) {
				arr[x][y]=pen;
				pen++;
				x--;
				y++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]!=0)System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
