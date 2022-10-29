package Vj”Ô∑®;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char c[] = sc.next().toCharArray();
			Arrays.sort(c);
			for (int i = 0; i < c.length; i++) {
				if (i==2) 
					System.out.println(c[i]);
				else 
					System.out.print(c[i]+" ");
			}
		}
	}

}
