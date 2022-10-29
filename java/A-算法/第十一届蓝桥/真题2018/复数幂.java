package 真题2018;

import java.math.BigInteger;

public class 复数幂 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("2");
		BigInteger b = new BigInteger("3");
		BigInteger A ;
		BigInteger B ;
		for (int i = 1; i <=123456; i++) {
			A = a.multiply(BigInteger.valueOf(2)).subtract(b.multiply(BigInteger.valueOf(3)));
			B = a.multiply(BigInteger.valueOf(3)).add(b.multiply(BigInteger.valueOf(2)));
			a = A;
			b = B;
		}	
		
		System.out.println("值："+a+b);
	}

}
