//第一题（交换变量）
//定义a=1; b=2;
//希望你进行某种运算后输出
//a=2; b=1; 
//此题有三种解法。


package JBfaxianbei;

public class A {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
//	方法一:交换
		int c = a ;  // c = 1
		a = b ;  // a = 2
		b = c ;  // b = 1
		System.out.println(String.valueOf(a) + String.valueOf(b) );
		System.out.println(a + " " +b);
		
//	方法二:亦或
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a+","+b);
		
//	方法三:加减
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+","+b);
	}
}
