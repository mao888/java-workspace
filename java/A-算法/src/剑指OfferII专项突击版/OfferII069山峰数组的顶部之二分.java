package 剑指OfferII专项突击版;

public class OfferII069山峰数组的顶部之二分 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,4,2};
		System.out.println(peakIndexInMountainArray(arr));
	}
	
    public static int peakIndexInMountainArray(int[] arr) {
    	return binarySearch(arr, 0, arr.length-1);
  
    }
    

    
	public static int binarySearch(int[] arr, int left, int right) {
		
		int ans = 0;
		// 当 left > right 时，说明递归整个数组，但是没有找到
		while (left <= right ) {
			
		int mid = (left + right)/2;
		
		if (arr[mid] > arr[mid+1]) {	        // 向左递归
			ans = mid;
			right = mid -1;
		}else if (arr[mid] < arr[mid+1]) { 	// 向右递归
			left = mid + 1;
		}else {
			return mid;
		}	
	}
		return ans;
		
	}
}
