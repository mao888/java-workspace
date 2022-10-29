package Vj语法;

import java.util.Scanner;

public class Z {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int count = 0;
			double arr[][] = new double[n+1][m+1];
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <= m; j++) {
					arr[i][j] = sc.nextDouble();
					arr[i][0]+=arr[i][j];
					arr[0][j]+=arr[i][j];
				}
				arr[i][0]/=m;			// 学生平均分
			}
			for (int i = 1; i <=m; i++) {
				arr[0][i]/=n;			// 科目平均分
			}
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=m; j++) {
					if(arr[i][j]<arr[0][j])break;
					if(arr[i][j]>=arr[0][j]&&j==m) {
						count++;
					}
				}
			}
			for (int i = 1; i <=n; i++) {
				System.out.print(String.format("%.2f",arr[i][0])+(i==n?"":" "));
			}
			System.out.println();
			for (int i = 1; i <=m; i++) {
				System.out.print(String.format("%.2f",arr[0][i])+(i==m?"":" "));
			}
			System.out.println();
			System.out.println(count);
			System.out.println();
		}
	}

}
