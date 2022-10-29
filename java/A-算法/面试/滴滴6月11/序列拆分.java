package µÎµÎ6ÔÂ11;

import java.security.PublicKey;
import java.util.Scanner;

public class ÐòÁÐ²ð·Ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- != 0) {
			int len = sc.nextInt();
			if (len <= 2) {
				System.out.println("YES");
			}
			int num[] = new int[len];
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}	
		}	
	}
	
	public static void name(int num[]) {
		int hong = 0;
		int lan = 1;
		int len = num.length;
		int num2[] = new int [len];
		
		for (int i = 0; i < num.length; i++) {
			num2[i] = 0;
			if (num2[i] > num2[i-1]) {
				num2[i] = 0;
			}else{
				num2[i+1] = 1;
			}
		
		}
		
	}
	
}