package B5月30周六;

import java.util.Scanner;

public class B6F特别数的和 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int n = input.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				String target = Integer.toString(i);
				if (target.indexOf("2") != -1 || target.indexOf("0") != -1 || target.indexOf("1") != -1
						|| target.indexOf("9") != -1) {
					sum += i;
				}
			}
			System.out.println(sum);
		} catch (Exception e) {
			input.close();
		}
	}
}