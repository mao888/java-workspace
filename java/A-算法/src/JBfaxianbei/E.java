package JBfaxianbei;

import java.util.Scanner;

//博弈
//每次保证两人取的值为m+1
//共17个糖果，最多取4个             
public class E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			if(n%(m+1)==0)System.out.println("No");
			else System.out.println("Yes");
		}
	}
}
 