//第九题（约瑟夫环）
//N个人围成一圈，从第一个人开始报数，报到m的人出圈，剩下的人继续从1开始报数，报到m的人出圈；如此往复，直到所有人出圈。（模拟此过程，输出出圈的人的序号）
//输入包含多组数据
//每组数据是 n  m。


package JBfaxianbei;
// 用while化环形为线性
import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[n];
			int x=n;				// 圈内现有X人
			int p=0;				// 游标，计算当前状态
			while (x>0) {
				for (int i = 0; i < n; i++) {
					if (arr[i]==0) {
						p++;
						if (p==m) {
							arr[i]=1;
							x--;
							p=0;
							System.out.println(i+1+" ");
						}	
					}
				}
			}
		}
	}
}
