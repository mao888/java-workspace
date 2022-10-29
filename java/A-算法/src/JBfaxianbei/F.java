//第六题（递归）
//用尽了千辛万苦，学妹终于答应和坤坤一起去吃饭，于是坤坤带学妹去吃坤坤最喜欢的大包子，坤坤平时吃包子都是一口吃四五个，为了在学妹面前表现得有气质一些，坤坤告诫自己一口只能吃一个或者两个，如果坤坤要吃N个包子，你知道有多少种吃法吗？
//输入包含多组数据
//每组数据是 n。
//输出n个包子对应的吃法。

package JBfaxianbei;
import java.util.*;
// 递归自调用
// 老大让小弟去做事
public class F {
	public static int find(int n) {
		if(n==0||n==1)return 1;
		else return find(n-1)+find(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			System.out.println(find(n));
		}
	}
}
 