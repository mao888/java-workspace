package Leetcode;

public class L977有序数组的平方2双指针 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-7,-3,2,3,11};
		int arr[] = new int [nums.length];
		for (int i = 0,j=nums.length-1,k=nums.length-1;i<=j;) {
			if (nums[i]*nums[i]>nums[j]*nums[j]) {
				arr[k]=nums[i]*nums[i];
				i++;
			}
			else {
				arr[k]=nums[j]*nums[j];
				j--;
			}
			k--;
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
