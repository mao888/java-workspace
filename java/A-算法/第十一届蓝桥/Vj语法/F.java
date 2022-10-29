package Vj”Ô∑®;

import java.util.Scanner;
import java.lang.Math;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
		double n = sc.nextDouble();
		int m = sc.nextInt();
		double arr[] = new double[m];
		arr[0]=n;
		double sum = n;
		for (int i = 1; i <m; i++) {
			arr[i] = Math.sqrt(arr[i-1]);
			sum+=arr[i];
		}
		System.out.println(String.format("%.2f",sum));
	}
	}

}
