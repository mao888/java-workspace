 package Vj”Ô∑®;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();  
		for (int t = 0; t < n; t++) {
			String s = sc.nextLine();
			char c[] = s.toCharArray();
			int sum = 0;
			for (int i = 0; i < c.length; i++) {
				if (c[i]-'0'>=0&&c[i]-'0'<=9) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
