package 美团笔试;

import java.util.Scanner;

public class 幸运数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		System.out.println(panduan(100000000));
	}
	public static boolean panduan(int a) {
		if (a % 11 == 0) {
			return true;
		}
		int count = 0;
		while(a !=0) {
			if (a %10 == 1) {
				count++;
			}
			a = a/10;
			if (count >=2) {
				return true;
			}
		}
		return false;
	}
	
}
