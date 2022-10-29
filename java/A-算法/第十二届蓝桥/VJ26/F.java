package VJ26;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double n =sc.nextDouble();
			int  m = sc.nextInt();
			double sum =n;
			for (int i = 1; i < m; i++) {
			
				n = Math.sqrt(n);
				sum+=n;
			}
			System.out.println(String.format("%.2f",sum));
			
		}
		
	}

}
//2021.4.17