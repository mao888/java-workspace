package 练习本;

public class char大小写转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AbcD";
		char c[]= s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]>96) {
				c[i] -= 32;
			}else {
				c[i] += 32;
			}
		}
		System.out.println(s.toString());
	}

}
