package 程序应用;

import java.util.Scanner;

public class dsf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,k,p=n;
		while (n!=0) {
			k=n%10;		//个位
			n=n/10;		//i减1位
			sum+=k*k*k;
		}
		if (p==sum)System.out.println(p+"是水仙花数");
		else System.out.println(p+"不是水仙花数");
		
	}

}
