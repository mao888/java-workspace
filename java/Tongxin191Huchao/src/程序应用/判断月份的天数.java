package 程序应用;

import java.util.Scanner;

public class 判断月份的天数 {

	public static void main(String[] args) {
		int month,days;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		switch (month) {
		case 2:days=28;
			   break;
		case 4:
		case 6:
		case 9:
		case 11:days=30;		//4 6 9 11 月份的天数为30天
				break;
		default:days=31;		//其他月份为31天
			break;
		}
		System.out.println(month+"月份为"+days+"天");
	}
}


















