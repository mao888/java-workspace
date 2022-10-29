//第三题（素数）
//输入数字T，表示有T组测试数据。
//输入数字N，表示需要求出第N个素数是多少。
//输出第n个素数。
package JBfaxianbei;
import java.util.Scanner;
// 用空间换时间
// 要钱，买东西-要钱，买东西-要钱，买东西
// 要钱，买东西-买东西-买东西
public class C {
	
	public static boolean check(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if((n/i)*i==n)return false;
		}
		return true;
}
	
	 public static void main(String[] args) {
		int arr[]=new int[10000];// 前10000项素数
		boolean b[]=new boolean[100000];// 前100000位自然数
		int p = 0;
		for (int i = 2; i < 100000; i++) {
			if(b[i])continue;
			else if (check(i)) {
				for (int j = i; j < b.length; j+=i) {
					b[j]=true;
				}
				arr[p]=i;
				p++;
			}
		}
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(arr[n-1]);
		}
	}

}
