package 精选思维15题;
// 斜率
import java.util.Scanner;

public class 打印图形step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		for (int i = 1; i <=n-1; i++) {
			for (int j = 1; j <=2*n-i; j++) {
				System.out.print(" ");
			}
			if (i==2) {
				System.out.println("*");
			}
//			for (int j = 1; j <=2; j++) {
//				System.out.print("* ");
//			}
			System.out.println();
		}
		for (int j = n; j <=2*n+n; j++) {
			System.out.print("* ");
		}
//		
//		for (int i = 2; i < n; i++) {
//			fo
//		}
		System.out.println();
		
		
		
		
		
		
		for (int i = n-1; i > 0; i--) {
			for (int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 2*i-1; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
