package VJ26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class I2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			StringBuilder str1 = new StringBuilder(str);
			str1.reverse();
			String str2 = str1.toString();
//		
			if (str.equals(str2)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
	}

}
