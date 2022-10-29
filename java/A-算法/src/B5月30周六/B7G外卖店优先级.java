package B5月30周六;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName: TakeawayShopPriority外卖店优先级
 * @Description: 创建一个记录店铺优先级的数组来存储优先级，另外创建一个用来判断每个时间点是否有订单的数组（1代表有 ，0无）
 * 这里偷懒使用集合充当缓存，可以使用数组之类的。
 * @author: colou
 */
public class B7G外卖店优先级 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			Set<Integer> set = new HashSet<Integer>();
			int N = input.nextInt();
			int M = input.nextInt();
			int T = input.nextInt();
			int[][] orders = new int[M][2];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < 2; j++) {
					orders[i][j] = input.nextInt();
				}
			}
			int[] priority = new int[N];
			int[] sign = new int[N];
			for (int i = 1; i <= T; i++) {
				for (int j = 0; j < M; j++) {
					if (orders[j][0] == i) {
						priority[orders[j][1] - 1] += 2;
						if (priority[orders[j][1] - 1] > 5 && !set.contains(orders[j][1] - 1)) {
							set.add(orders[j][1] - 1);
						}
						sign[orders[j][1] - 1] = 1;
					}
				}
				for (int j = 0; j < N; j++) {
					if (sign[j] == 0 && priority[j] > 0)
						priority[j]--;
					if (priority[j] <= 3) {
						set.remove(j);
					}
				}
				sign = new int[N];
			}
			System.out.println(set.size());
		} catch (Exception e) {
			input.close();
		}
	}
}
