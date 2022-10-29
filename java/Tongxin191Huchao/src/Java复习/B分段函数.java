package Java复习;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B分段函数 {

	public static void main(String[] args) {
		double y;
		System.out.println("请输入X的值");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		if (0 <= x && x < 20) {
			if (0 <= x && x < 5) {
				y = -x + 2.5;
			} else if (5 <= x && x < 10) {
				y = 2 - 1.5 * (x - 3) * (x - 3); 
			} else {
				y = x / 2 - 1.5;
			}System.out.println(y);
			}
		
				
	}
}

class test2{
	
	
}