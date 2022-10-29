package 程序应用;
//1--100之间既能被3又能被7整除的数
public class Exercise4_33和7整除 {
	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			if (i%3==0&&i%7==0) {
				System.out.println(i+" ");
			}
		}
	}
}
