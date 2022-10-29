package 龙寰科技;

import java.util.Scanner;

public class 研发小测 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(NumberOf1(n));
	}                        
	
	// 先将该整数转为二进制字符串，在将字符串转为字符数组，计算字符数组中1的个数
	public static int NumberOf1(int n) {
        int tmp = 0;
        char[] arr = Integer
        		.toBinaryString(n)	// 将整数n转为二进制字符串
        		.toCharArray();		// 将字符串转为字符数组
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '1'){//判断是否为字符1
                tmp++;
            }
        }
        return tmp;
    }
	
}
