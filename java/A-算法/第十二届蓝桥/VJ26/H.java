package VJ26;

import java.util.Scanner;
import java.util.jar.Attributes.Name;


public class H {
	
	static double arr[] = new double[1001];
	public static void name() {
		for (int i = 1; i < 1001; i++) {
			arr[i]=1.0/i;		//ע:1.0/5
		}
		
		for (int i = 1; i < 1001; i++) {
			if (i%2==0) {
				arr[i] = arr[i-1]-arr[i];
			}else {
				arr[i]=arr[i-1]+arr[i];
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		name();
		for (int i = 0; i < m; i++) {
			int n =sc.nextInt();
			System.out.println(String.format("%.2f",arr[n]));
		}
			
	}

}
