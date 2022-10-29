package ¸ñÁÖÉîÍ«;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getValue(2));
	}
	
	public static int getValue(int i) {
		int res = 0;
		switch(i) {
			case 1:
				res = res + 1;
			case 2:
				res = res + i * 2;
			case 3:
				res = res + i * 3;
		}
		return res;
	}

}
