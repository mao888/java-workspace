package 蓝信春招0322;

import java.util.Arrays;

public class 数组合并 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] merge(int []nums1,int m,int []nums2,int n) {
    	int a[]=new int[m+n];
    	for(int i=0;i<m;i++) {
    		a[i]=nums1[i];
    	}
    	for(int i=m;i<m+n;i++) {
    		a[i]=nums2[i-m];
    	}
    	Arrays.sort(a);	
    	return a;
    }

}
