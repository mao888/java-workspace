package Vj”Ô∑®;

import java.util.Arrays;
import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			double arr[] = new double[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextDouble();
			}
			Arrays.sort(arr);
			double sum = 0;
			for (int i = 1; i < n-1; i++) {
				sum+=arr[i];
			}
			System.out.println(String.format("%.2f",sum/(n-2)));
		}
	}

}
