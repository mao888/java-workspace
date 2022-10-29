package 同盾科技;

import java.util.Arrays;
import java.util.Scanner;
public class 数组中超过一半的数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
		int ar = in.nextInt();
        int arr[] = new int[ar];
		for (int i = 0; i < arr.length; i++) {
			int a2 = in.nextInt();
			arr[i] = a2;
		}
        System.out.println(MoreThanHalfNum(arr));
    
    }
    
    public static int MoreThanHalfNum(int []array) {
    	Arrays.sort(array);
    	int i = array[array.length/2];
    	int count = 0;
    	for (int n = 0; n < array.length; n++) {
			if (array[n]==i) {
				count++;
			}
		}
    	if (count > array.length/2) {
			return i;
		}else {
			return 0;
		}
    }
}