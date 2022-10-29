package B5月30周六;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10J灵能传输 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 可能会遇到大数量的数字 使用流读取数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());// 数据组数
		int n;// 每组数据数字个数
		String[] a;// 按空格分割字符串,每个字符串对应下标+1处的灵能
		int[] s;// 存储灵能
		int[] st;// 记录排序后的s
		boolean[] visit;//记录s中的值是否已经参与排序
		while (N-- >= 0) {
			n = Integer.parseInt(br.readLine().trim());

			a = br.readLine().split("\\s+");

			s = new int[a.length + 1];
			st = new int[a.length + 1];
			visit=new boolean[a.length + 1];
			for (int i = 1; i <= n; i++) {
				// 对每组数据进行前缀和的计算
				s[i] = s[i - 1] + Integer.parseInt(a[i - 1]);
			}
			int s0 = s[0];
			int sn = s[n];
			if (s[0] > s[n]) {
				int temp = s[0];
				s[0] = s[n];
				s[n] = temp;
			}
			Arrays.sort(s);
			for (int i = 0; i <= n; i++)
				if (s0 == s[i]) {
					s0 = i;
					break;
				}
			for (int i = n; i >= 0; i--)
				if (sn == s[i]) {
					sn = i;
					break;
				}
			int l = 0, r = n;
			for (int i = s0; i >= 0; i-=2) {
				st[l++] = s[i];
				visit[i]=true;
			}
			for(int i=sn;i<=n;i+=2) {
				st[r--]=s[i];
				visit[i]=true;
			}
			for(int i=0;i<=n;i++) {
				if(!visit[i]) {
					st[l++]=s[i];
				}
			}
			int max=0;
			for(int i=1;i<=n;i++) {
				max=Math.max(max, Math.abs(st[i]-st[i-1]));
			}
			System.out.println(max);
		}
	}
}
