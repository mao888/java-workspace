package 美团笔试4月2日;

import java.util.Scanner;

public class 双色球 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int b = sc.nextInt();
		String str = sc.next();
		char[] charArray = str.toCharArray();
		int sum = 0;
		int bx = 0;
		int rx = 0;
		int ry = r;
		int by = b;
		for (int i = 0; i < charArray.length-1; i++) {
			
			if (RFlag(charArray, i)) {
				b --;
				if (b<0) {
					bx ++;
				}
				sum ++;
			}else if (BFlag(charArray, i)) {
				r --;
				if (r<0) {
					rx ++;
				}
				sum ++;
			}
		}
		if (IsFlag(charArray, ry, by)) {
			System.out.println((n+sum));
		}else {
			System.out.println(rx+" "+bx);
		}

	}
	
	public static boolean IsFlag(char[] charArray,int ry,int by) {
		for (int i = 0; i < charArray.length-1; i++) {
			if (RFlag(charArray, i)) {
				by --;
				if (by<0) {
					return false;
				}
			}else if (BFlag(charArray, i)) {
				ry --;
				if (ry<0) {
					return false;
				}
			}
			
		}
		return true;
	}
	
	public static boolean RFlag(char[] arr,int i) {
		if (arr[i]==arr[i+1]&& arr[i] == 'r' ) {
			return true;
		}
		return false;
	}
	public static boolean BFlag(char[] arr,int i) {
		if (arr[i]==arr[i+1]&& arr[i] == 'b' ) {
			return true;
		}
		return false;
	}
	
}
