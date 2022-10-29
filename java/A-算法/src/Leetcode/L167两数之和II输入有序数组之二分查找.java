package Leetcode;

public class L167两数之和II输入有序数组之二分查找 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,7,11,15};
		int target = 9;
		System.out.println(new L167两数之和II输入有序数组之二分查找().twoSum(numbers, target));
	}
	
    public int[] twoSum(int[] numbers, int target) {
//    	int arr[] = new int [2];
    	for (int i = 0; i < numbers.length; i++) {
			int low = i+1;
			int high = numbers.length-1;
			while (low<=high) {
				int middle = low +(high-low)/2;
				if (numbers[middle]==target-numbers[i]) {
					 return new int[]{i + 1, middle + 1};
				}else if (numbers[middle]>target-numbers[i]) {
					high=middle-1;
				}else {
					low=middle+1;
				}
			}
		}
    	return new int[0];
    }
//	public int[] twoSum(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length; ++i) {
//            int low = i + 1, high = numbers.length - 1;
//            while (low <= high) {
//                int mid = (high - low) / 2 + low;
//                if (numbers[mid] == target - numbers[i]) {
//                    return new int[]{i + 1, mid + 1};
//                } else if (numbers[mid] > target - numbers[i]) {
//                    high = mid - 1;
//                } else {
//                    low = mid + 1;
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }
	


}
