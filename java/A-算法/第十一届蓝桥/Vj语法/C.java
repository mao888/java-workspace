package Vj”Ô∑®;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			long x = 0,y=0;
			for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
				if (i%2==0) {
					x += i*i;
				}else {
					y+=i*i*i;
				};
			}
			System.out.println(x+" "+y);
		}
	
	}

}
