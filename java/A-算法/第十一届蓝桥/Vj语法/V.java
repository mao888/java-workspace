package Vj”Ô∑®;

import java.util.Scanner;
public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.next();
			char c[] = s.toCharArray();
			char maxs= 'A';
			for (int i = 0; i < c.length; i++) {
				if(maxs<c[i]) {
					maxs=c[i];
				}
			}
			StringBuilder sd= new StringBuilder();
			for (int i = 0; i < c.length; i++) {
				sd.append(c[i]);
				if (maxs==c[i]) {
					sd.append("(max)");
				}
			}
			System.out.println(sd);
		}
	}
	

}
