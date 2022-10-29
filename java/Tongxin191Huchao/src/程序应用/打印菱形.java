package 程序应用;

import java.util.Scanner;

public class 打印菱形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 行数
		System.out.println("请输入要打印的行数:");
			Scanner sc= new Scanner(System.in);
			int row = sc.nextInt();
				// 内容最多的一行的行数
				int maxNum = (row + 1) / 2;
				// 正三角
				for(int i = 1; i <= maxNum; i++) {
					// 空格
					for(int j = 1; j <= maxNum- i; j++) {
						System.out.print(" ");
					}
					// 内容
					for(int k = 1; k <= (2 * i) - 1; k++) {
						System.out.print("*");
					}
					// 换行
					System.out.println();
				}
				// 正三角
				
				// 倒三角
				for(int i = row - maxNum; i > 0; i--) {
					// 空格
					for(int j = 1; j <= maxNum - i; j++) {
						System.out.print(" ");
					}
					// 内容
					for(int k = 1; k <= 2 * i -1; k++) {
						System.out.print("*");
					}
					// 换行
					System.out.println();
				}
				// 倒三角
		
	}

}
