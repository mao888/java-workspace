package 程序应用;

public class 交换两数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		//方法一:
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("交换后:a=:"+a+" b="+b);
		//方法二:
		int c =a+b;
		b=c-a;		//15-10=5 b=5;
		a=c-b;		//15-5=10 a=10
		 System.out.println("a = " + a);
	     System.out.println("b = " + b);
		//方法三:异或运算
		c = a ^ b;
	     b = c ^ b; 
	     a = c ^ a;
	     System.out.println("a = " + a);
	     System.out.println("b = " + b);
	}

}
