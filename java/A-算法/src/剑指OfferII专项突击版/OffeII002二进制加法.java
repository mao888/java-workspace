package 剑指OfferII专项突击版;

/** 
 *static String toBinaryString(int i) 
  在基数2中返回整数参数的字符串表示形式为无符号整数。  
 * */

/**
 * public static int parseInt(String s,
                           int radix)
                    throws NumberFormatException
                    将字符串参数解析为第二个参数指定的基数中的有符号整数。 
                    字符串中的字符必须全部是指定基数的数字（由Character.digit(char, int)返回非负值确定），
                    除了第一个字符可能是ASCII减号'-' （ '\u002D' ）以指示负值或ASCII加号'+' （ '\u002B' ）以表示正值。 
                    返回所得到的整数值。 
 * */

public class OffeII002二进制加法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
//		System.out.println(Integer.toBinaryString(
//				Integer.parseInt(a,2) + Integer.parseInt(b,2)
//				)
//			);
		System.out.println(a.charAt(a.length()-2));
//		a.charAt(a.length()-1-'0');
	}

}
