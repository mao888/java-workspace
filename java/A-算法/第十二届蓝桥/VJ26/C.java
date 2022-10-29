package VJ26;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long j =0,o=0;
			for (int i = Math.min(a, b); i <=Math.max(a, b); i++) {
				if (i%2==0) {
					o+=i*i;
				}else {
					j+=i*i*i;
				}
			}
			
			System.out.println(o+" "+j);
		}
	}

}
