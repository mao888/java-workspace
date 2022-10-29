//从键盘输入n个数，求这n个数中的最大数与最小数并输出
	import java.util.Scanner;
	public class T1{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入n个数");
			int n = sc.nextInt();
//			int num[] = new int[n];
//			for (int i = 0; i < n; i++) {
//				num[i] = sc.nextInt();
//			}
			int min = 0;
			int max = 0;
			int b[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("请输入第" + (i + 1) + "个整数");
				b[i] = sc.nextInt();
			}
			min = max = b[0];
			for (int i = 1; i < n; i++) {
				if (min > b[i]) {
					min = b[i];
				}
				if (max < b[i]) {
					max = b[i];
				}
			}
			System.out.println(min + "  " + max);
		}
	}
