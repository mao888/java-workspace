package Vj”Ô∑®;

import java.util.Scanner;

public class B2 {

	public static int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static void year(int x) {
		if(x%4==0 && x%100!=0||(x%400==0))
			month[2]=29;
		else
			month[2]=28;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s[]=sc.nextLine().split("/");
			int sum=0;
			year(Integer.valueOf(s[0]));
			for (int i = 1; i < Integer.valueOf(s[1]); i++) {
				sum+=month[i];
			}
			System.out.println(sum+Integer.valueOf(s[2]));
		}
		
	}
}
