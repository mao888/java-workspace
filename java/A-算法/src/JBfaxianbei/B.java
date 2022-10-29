//第二题（排序）
//输入n个数据将其进行从小到大排序
//输入：
//第一行输入数字n；
//第二行输入n个数字；
//输出：
//对输入的n个数字排序后的顺序 


package JBfaxianbei;

import java.util.Arrays;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
	
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]+" ");
		}
	} 

}
 