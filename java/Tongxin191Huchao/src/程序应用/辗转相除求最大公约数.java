package 程序应用;
import java.util.Scanner;
public class 辗转相除求最大公约数 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字a:");
		a = sc.nextInt();
		System.out.println("请输入数字b:");
		b = sc.nextInt();
		System.out.print("gcb("+a+","+b+")=");
		do {
			k=a%b;
			a=b;
			b=k;
		} while (k!=0);
		System.out.println(a);
	}
}

