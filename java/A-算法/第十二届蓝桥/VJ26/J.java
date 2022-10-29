package VJ26;

import java.util.Scanner;

public class J {

	static boolean arr[] = new boolean [3000];
	public static void name() {
		for (int i = 0; i < 3000; i++) {
			arr[i]=true;
		}
		for (int i = 0; i < 3000; i++) {
			for (int j = i*2; j < 3000; j+=i) {
				arr[j]=false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		name();
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int y =sc.nextInt();
			
			if (x==0&&y==0) {
				break;
			}
			boolean flag = false;
			for (int i = x; i <= y; i++) {
				if (!arr[i*i+i+41]) {
					flag = false;
				}
				System.out.println(flag?"OK":"Sorry");
			}
		}
		
	}

}
