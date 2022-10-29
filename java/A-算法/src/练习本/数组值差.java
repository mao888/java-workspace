package 练习本;
import java.util.Arrays; 

public class 数组值差 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {5, 7, 2, 4, 9};
		System.out.println("原始数组："+Arrays.toString(array_nums)); 
		int max_val = array_nums[0];
		int min = array_nums[0];
		for(int i = 1; i < array_nums.length; i++)
		{
			if(array_nums[i] > max_val)
				max_val = array_nums[i];
			else if(array_nums[i] < min)
				min = array_nums[i];
		}
		System.out.println("所述数组的最大值和最小值之差： "+(max_val-min));	
	 }

	}

