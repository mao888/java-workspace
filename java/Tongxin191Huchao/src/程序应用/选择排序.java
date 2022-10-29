package 程序应用;

public class 选择排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{12,9,89,-75,65,98,123,45};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]<arr[j]) {	//由大到小输出
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
