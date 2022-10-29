package 美团笔试3月19;

import java.util.Scanner;

public class 点外卖 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();	
		}
        for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner.nextInt();	
		}
        int m = scanner.nextInt();
        int arr3[] = new int[m];
        int arr4[] = new int[m];
        for (int i = 0; i < arr3.length; i++) {
			arr3[i] = scanner.nextInt();	
		}
        for (int i = 0; i < arr3.length; i++) {
			arr3[i] = scanner.nextInt();	
		}
        System.out.println("BZM");
	}

}
