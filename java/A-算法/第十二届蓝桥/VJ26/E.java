package VJ26;

import java.util.Arrays;
import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		while (sc.hasNext()) {
			char a [] = sc.next().toCharArray();
			Arrays.sort(a);
			
			for (int i = 0; i < 3; i++) {
				if (i==2) {
					System.out.println(a[i]);
				}else {
					System.out.print(a[i]+" ");
				}
			}
		}
		
	}

}
