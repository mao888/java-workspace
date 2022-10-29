package 练习本;
import java.util.Arrays; 
public class 数组奇偶个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {5, 7, 2, 4, 9};
		System.out.println("原始数组： "+Arrays.toString(array_nums)); 
		int ctr = 0;
		for(int i = 0; i < array_nums.length; i++)
		{
			if(array_nums[i] % 2 == 0)
				ctr++;
		}
		System.out.println("偶数个数： "+ctr);
		System.out.println("奇数个数： "+(array_nums.length-ctr));
	}

}
