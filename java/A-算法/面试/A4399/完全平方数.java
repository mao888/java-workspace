package A4399;

import java.util.Iterator;
import java.util.Scanner;

public class 完全平方数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isTwoSquareSum(13));
	}
	
	public static boolean isTwoSquareSum(int num) {
		int a = num;
		int b = num;
		for (int i = 1; i < a; i++) {
			for (int j = i+1; j <=b; j++) {
				if (i*i + j*j == num) {
					return true;
				}
			}
		}
		
		return false;
	}

}
