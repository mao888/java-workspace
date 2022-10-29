package B5月30周六;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: PostfixExpression后缀表达式
 * @Description: 这道题我的思想是分情况讨论：
 * 1.如果只有+号，没有-号，则遍历数组累加即可；
 * 2.如果只有-号，没有+号，首先从小到大排序，然后分两种情况考虑：
 * （1）.最小值是负数（也就是含有负数），例如[-2, -1, 3, 4, 5]，四个减号，运算过程为5 - (-1) - (-2 - 3 - 4) = 5 + 1 - (-9)
 *  = 5 + 1 + 9 = 15，也就是说只要含有负数，负数转正数，全部相加即可
 * （2）.最小值是正数（全部是正数），例如[1, 2, 3]，两个减号，运算过程为3 - (1 - 2) = 3 + 2 - 1，也就是说运算规则为除了
 *         最小值以外的正数相加减去最小值 
 * 3.如果有+号，有-号，则讨论减号的个数与负数的个数，分两种情况讨论（实际分为三种）：
 *（ 1）.减号个数大于等于负数个数（则将负数变正数，每一个负数变正数的过程中， 减号的数量需要减一，然后排序,遍历数组从大到小累加，
 * 直至剩下的数字个数和减号数量相同，然后再减去这些剩下的数字）；
 * （2）.减号个数小于负数个数，这个时候我们就应该使用+号，消除负数（比如[2, -5 , -6, + , -]，运算过程为2 - ((-5) + (-6)) = 
 * 2 + 11 = 13）,我们可以再分情况讨论：
 * （2.1）.全是负数，如[-1, -2, -3, -4, -5],其中一个加号三个减号，运算过程为（-1 - ((-4) + (-5)) - (-3) - (-2) = -1 + 9 
 * + 3 + 2）,则运算规律为首先排序选择其中的最大值，加上其他数字的绝对值就行（可以自行继续证明）。（2.2）.有正数，有负数，
 * [-1, 19, 17, -4, -5],其中两个加号两个减号，则运算过程为（19 + 17 - ((-4) + (-5)) - (-1) = 19 + 17 + 9 + 1）,则运算
 * 规律为首先排序选择其中的最大值，加上其他数字的绝对值就行（可以自行继续证明）。所有情况讨论完毕。
 * @author: colou
 */
public class B9I后缀表达式 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int add = input.nextInt();
			int reduce = input.nextInt();
			int totalLength = add + reduce + 1;
			int[] number = new int[totalLength];
			for (int i = 0; i < totalLength; i++) {
				number[i] = input.nextInt();
			}
			int sum = 0;
			if (reduce == 0) {
				for (int i = 0; i < totalLength; i++) {
					sum += number[i];
				}
			}
			if (add == 0) {
				Arrays.sort(number);
				if (number[0] < 0) {
					for (int i = 0; i <= reduce; i++) {
						if (number[i] > 0) 
							sum += number[i];
						else
							sum -= number[i];
					}
				} else {
					for (int i = 1; i <= reduce; i++) {
							sum += number[i];
					}
					sum -= number[0];
				}
			}
			if (add != 0 && reduce != 0) {
				int reduceNum = 0;
				for (int i = 0; i < totalLength; i++) {
					if (number[i] < 0) {
						reduceNum++;
					}
				}
				if (reduce >= reduceNum) {
					Arrays.sort(number);
					int temp = reduce;
					for (int i = 0; i < reduceNum; i++) {
						number[i] = -number[i];
						temp--;
					}
					Arrays.sort(number);
					for (int i = totalLength - 1; i >= temp; i--) {
						sum += number[i];
					}
					for (int i = temp - 1; i >= 0; i--) {
						sum -= number[i];
					}
				} else {
					Arrays.sort(number);
					sum += number[totalLength - 1];
					for (int i = 0; i < totalLength - 1; i++) {
						if (number[i] > 0)
							sum += number[i];
						else
							sum -= number[i];
					}
				}
			}
			System.out.println(sum);
		} catch (Exception e) {
			input.close();
		}
	}
}
