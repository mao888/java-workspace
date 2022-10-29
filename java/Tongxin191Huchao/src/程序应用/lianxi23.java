package 程序应用;
//从键盘上输入10个整数，并将其放入一维数组a中。将下标相差5的元素分为一组，
//即：a[0]和a[5]，a[1]和a[6]，a[2]和a[7]，a[3]和a[8]，a[4]和a[9]，
//用循环判断每组元素的第1个是否大于第2个，若是，交换两元素。
//分别输出数组原来各元素的值和对换后各元素的值。
import static org.junit.Assert.fail;

import java.util.Scanner;

public class lianxi23 {
	public static void main(String[] args) {
		int arr[]= new int [10]; 
		int arr1[]= new int [10];
		int t;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)arr[i]= sc.nextInt();
		for (int i = 0; i < arr1.length/2; i++) {
			arr1[i*2]=arr[i];
	        arr1[i*2+1]=arr[i+5];
	        if (arr1[i*2]>arr1[i*2+1]) {
	        	t=arr1[i*2];
	        	arr1[i*2]=arr1[i*2+1];
	        	arr1[i*2+1]=t; 
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}

