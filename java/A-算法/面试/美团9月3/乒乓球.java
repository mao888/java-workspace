package √¿Õ≈9‘¬3;

import java.util.Scanner;

public class ∆π≈“«Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(pingPang(a, b));
		
	}
	
	public static int pingPang(int a,int b) {
	
		if (a < 11 && b<= 9) {
			return 11-a;
		} else if(a < 11 && 9 < b && b <= 11) {
			return b-a + 2;
		} else if(a >= 11 && b <= 11 ) {
			// 13 11
			if (a - b >=2) {
				return 0;
			}else {		// 11 11  11 10
				return 2-(a-b);
			}
		} else if(a >=11 && b>=11) {
			if (a <= b) {	//11 15 11 11
				return b-a+2;
			} else {	// a > b  12 11
				if (a - b <=1) {
					return 2-(a-b);
				} else {	// a-b >=2
					return 0;
				}
			}
		}
		return 0;
	}

}
 