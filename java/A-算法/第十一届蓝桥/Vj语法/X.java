package Vj”Ô∑®;

import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n==0) break;
			int sum=0;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				sum+=x/100;
				x=x%100;
				sum+=x/50;
				x=x%50;
				sum+=x/10;
				x=x%10;
				sum+=x/5;
				x=x%5;
				sum+=x/2;
				x=x%2;
				sum+=x;
			}
			System.out.println(sum);
		}
	}

}
