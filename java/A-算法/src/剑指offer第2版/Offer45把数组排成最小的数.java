package 剑指offer第2版;

import java.util.Arrays;

//这道题本质上是一道排序题，并且只能由基于比较的排序算法完成。
//如果 a 和 b 组成的字符串大于 b 和 a 组成的字符串，则交换 a 和 b。
//尝试用冒泡排序算法完成本题。
public class Offer45把数组排成最小的数 {
	
	static int arr[] = {3,30,34,5,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minNumber(arr));
	}
    public static String minNumber(int[] nums) {
    	bubbleSort(nums);
    	return Arrays.toString(nums).replaceAll("\\[|]|,|\\s", "");
    }
    
    // 冒泡排序
    public static void bubbleSort(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
                if (("" + arr[i] + arr[j]).compareTo("" + arr[j] + arr[i]) > 0) {
                    // 如果 "" + arr[i] + arr[i + 1] 组成的字符串大于 "" + arr[i + 1] + arr[i] 组成的字符串，则交换
                    swap(arr, i, j);
                }
				
			}
		}
    	
    }
       
    public static void swap(int arr[],int i,int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    
}
