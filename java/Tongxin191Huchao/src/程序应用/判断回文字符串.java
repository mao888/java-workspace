package 程序应用;

import java.util.Scanner;

public class 判断回文字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("请输入字符串:");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length/2; i++) {
			if (chr[i]!=chr[chr.length-1-i]) {
				System.out.println(str+"不是回文字符串");
				break;
			}else {
				System.out.println(str+"是回文字符串");
				break;
			}
		}
		
	}

}
