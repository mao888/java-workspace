package Leetcode;

import java.security.Policy;
import java.util.Arrays;
import java.util.Iterator;

import 数组.foreach遍历二维数组;
import 练习本.a;

public class L912排序数组之快排优化 {
	
	static int nums[] = {5,1,1,2,0,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortArray(nums);
	}
	
    public static int[] sortArray(int[] nums) {
    	partition(nums, 0, nums.length-1);
    	for (int i : nums) {
			System.out.println(i);
		}
    	return nums;
    }
    // 快排
	public static void QuickSort(int arr[],int start,int end) {
		// 如果区域内的数字少于2个，退出递归
		if (start < end) {
			// 将数组分区，并获得中间值的下标
		    int d = partition(arr, start, end);
		    // 对左边区域快速排序
		    QuickSort(arr, start, d - 1);
		    // 对右边区域快速排序
		    QuickSort(arr, d + 1, end);
		}

	}
    // 分区算法
    public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		// 将第一个元素作为pivot
		while (i<j) {
			while (i<j&&pivot<arr[j]) {	// 从右边开始找出小于pivot
				j--;
			}
			if (i<j) {
				arr[i] = arr[j];
				i++;
			}
			while (i<j&&arr[i]<pivot) {	// 找出大于pivot
				i++;
			}
			if (i<j) {
				arr[j] = arr[i];
				j--;
			}
		}
		arr[i] = pivot;	// 这时i是pivot最终位置
		return i;
	}
	
}
