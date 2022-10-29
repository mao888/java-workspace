package VJ26;

import java.util.Scanner;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b =sc.nextInt();
			
			long x =0,y=0;
			for (int i = a<b?a:b; i <= (a>b?a:b); i++) {
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
