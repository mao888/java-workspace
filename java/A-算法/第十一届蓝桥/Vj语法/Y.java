package Vj语法;

import java.util.Scanner;

public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			long arr[][] = new long[m][n]; // 定义long,否则转绝对值爆int
			long x=0,y=0,value=0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					long c = sc.nextInt();
					if (Math.abs(c)>Math.abs(value)) {
						value = c;
						x = i;
						y = j;
					}
				}
			}
			System.out.println((x+1)+" "+(y+1)+" "+value);
		}
	}

}
