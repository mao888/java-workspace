package 程序应用;

public class 冒泡排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{12,9,89,-75,65,98,123,45};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {		//由小到大
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
