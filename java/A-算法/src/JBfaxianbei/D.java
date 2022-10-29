//正式题目：
//第四题（语句）
//一天坤坤正在实验室做题，这时候一个学弟跑过来问：
//“学长我刚刚会打印菱形，现在我想打印出来一个六角星，可是我不会，你能教我吗？”
//坤坤说：“哇！好难呀！我也不会呀！”
//过了一会，一个学妹过来问了相同的问题，坤坤立刻帮她解答了。
//请问你知道坤坤怎么打印的六角星吗？
//
//数据包含多组输入
//每组数据N。
//输出N对应的的六角星图案。
 
package JBfaxianbei;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			for(int i=1;i<=4*(n-1)+1;i++) {    		// 行
				for(int j=1;j<=5*(n-1)+n;j++) {		// 列
					if((i==n&&j%2==1)||(i==3*n-2&&j%2==1)||i==j+n-1||i==j-3*n+3||i==-j+3)
						System.out.print("*");
					else 
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
