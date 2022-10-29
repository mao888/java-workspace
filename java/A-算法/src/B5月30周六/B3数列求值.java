package B5月30周六;

public class B3数列求值 {

	public static void main(String[] args) {
		int a = 1, b = 1, c = 1;
		// 要是求第四项，则i < 4, 同理推得求20190324，则i < 20190324。
		for (int i = 3; i < 20190324; i++) {
			int temp = (a + b + c) % 10000;
			a = b;
			b = c;
			c = temp;
		}
		System.out.println(c);
	}
}
