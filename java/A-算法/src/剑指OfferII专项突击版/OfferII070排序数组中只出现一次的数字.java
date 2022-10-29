package 剑指OfferII专项突击版;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class OfferII070排序数组中只出现一次的数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,3,7,7,10,11,11};
//		System.out.println(singleNonDuplicate(nums));
		System.out.println(singleNonDuplicate2(nums));
	}
	
	/**
	 * 方法一异或
	 * @param nums
	 * @return
	 */
    public static int singleNonDuplicate(int[] nums) {
    	int a = 0;
    	for (int i : nums) {
    		a = a^i;
		}
    	return a;
    }
    
    /**
     * 方法二： 二分
     * @param nums
     * @return
     */
    /**
     * 二分查找过程中中间值nums[mid]的特征？有三种情况
     * 	1、它跟它后面一个数字相同
     * 	2、它跟它前面一个数字相同
     * 	3、它就是答案
     *  如果mid所对应的一对数字下标是(奇数，偶数)，那么目标一定在mid之前，如果下标是(偶数，奇数)，目标一定在mid之后
     */
    public static int singleNonDuplicate2(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid < n - 1 && nums[mid] == nums[mid + 1]) { //偶 奇 左指针右移 
                if (mid % 2 == 0) {
                    l = mid + 2;
                } else {			//奇 偶 右指针左移
                    r = mid - 1;
                }
            } else if (mid > 0 && nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 0) {	// 奇 偶 右指针左移
                    r = mid - 2;
                } else {
                    l = mid + 1;	//偶 奇 左指针右移 
                }
            } else {	
                return nums[mid];
            }
        }
        // 由于题目的性质，ans一定会被找到，所以不会返回-1
        return 0;
    }
}
