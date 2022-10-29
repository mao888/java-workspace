package VJ26;

import java.util.Scanner;

public class C2 {

	public static int Min(int a,int b) {
		int min = 0;
		if (a>b) {
			min =b;
		}else {
			min=a;
		}
		return min;
	}
	
	public static int Max(int a,int b) {
		int max = 0;
		if (a>b) {
			max =a;
		}
		else {
			max =b;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long x = 0,y=0;
			
//			System.out.println(Min(a, b));
			for (int i = Min(a,b); i <=Max(a,b) ; i++) {
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
