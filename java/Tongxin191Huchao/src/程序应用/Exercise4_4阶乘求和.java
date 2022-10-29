package 程序应用;
//1--n阶乘求和
import java.util.Scanner;

public class Exercise4_4阶乘求和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		for (int i = 1; i <=n; i++) {
			int s=1;
			for (int j = 1; j <=i ; j++) {
				s*=j;
			}
			sum+=s;
	
		}
		System.out.println(sum);
	}

}
