package VjÓï·¨;

import java.util.Scanner;	
public class R {
	public static int arr[]= new int[102];
	public static void name() {
		for (int j = 0; j < arr.length; j++) {
			arr[j]=j*2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		name();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int sum = 0;
			for (int i = 1; i < n; i++) {
				sum+=arr[i];
				if (i%m==0) {
					System.out.print(sum/m+" ");
					sum=0;
				}
			}
			sum+=arr[n];
			if (n%m==0) {
				System.out.println(sum/m);
			}else {
				System.out.println(sum/(n%m));
			}
		}
	}

}
