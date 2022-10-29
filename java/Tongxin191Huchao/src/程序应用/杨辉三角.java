package 程序应用;

import java.util.Scanner;

public class 杨辉三角 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("请输入杨辉三角的行数:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int arr[][] = new int[a][];									// 声明a行二维数组，存放杨辉三角行的各数
		System.out.println("杨辉三角形");
		for (int i = 0; i < arr.length; i++)arr[i]= new int [i+1];	//定义二维数组的第i行有i+1列
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				arr[i][0]=arr[i][j]=1;
				if (i>0&&j>0&&j<i)arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
