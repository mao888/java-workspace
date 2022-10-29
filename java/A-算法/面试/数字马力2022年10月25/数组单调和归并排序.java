package 数字马力2022年10月25;

import java.util.Scanner;

public class 数组单调和归并排序 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (arr == null || n == 0) {
            System.out.println(0);
        }
		System.out.println(mergeSortRecursion(arr, 0, n-1)  % 1000000007);
	}
	
	/**
     * 递归实现归并排序
     */
    public static int mergeSortRecursion(int[] arr, int l, int r) {
        if (l == r) {   // 当待排序数组长度为1时，递归开始回溯，进行merge操作
            return 0;
        }
        int mid = (l + r) / 2;
        return mergeSortRecursion(arr, l, mid) + mergeSortRecursion(arr, mid + 1, r) + merge(arr, l, mid, r);
    }
    
    /**
     * 合并两个已排好序的数组s[left...mid]和s[mid+1...right]
    */
    public static int merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];    // 辅助存储空间 O(n)
        int index = 0;
        int i = left;
        int j = mid + 1;
        int smallSum = 0;       // 新增，用来累加数组小和
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                // 当前一个数组元素小于或等于后一个数组元素时，累加小和
                // s[i] <= s[j] -> s[i] <= s[j]...s[right]
                smallSum += arr[i] * (right - j + 1);
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left++] = temp[k];
        }
        return smallSum;
    }
}
