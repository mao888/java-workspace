package Java¸´Ï°;
import java.util.Scanner;
public class Callatz¿¨À­×È²ÂÏë {
	public static void main(String[] args) {
		int a ;
		Scanner reader = new Scanner(System.in);
		a = reader.nextInt();
		for(int i = 1; i < 1000; i ++) {
			if(a != 1) {
				if(a % 2 == 0) {
					a = a/2;
				}
				else {
					a = (3 * a + 1)/2;
				}
				if(a == 1) {
					System.out.println(i);
					break;
				}
			}
			if(a == 1) {
				System.out.println(0);
				break;
			}
		}
	}
}
