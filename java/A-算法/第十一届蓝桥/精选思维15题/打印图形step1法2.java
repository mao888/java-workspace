package 精选思维15题;
// 数组
import java.util.Scanner;

public class 打印图形step1法2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		if (n==1) 
			System.out.print('*');
		else if (n>1&&n<=20) {
			
			int i = 4*n-3;
			int j = 6*n-5;
			char arr[][]=new char[i][j];
			
			for (int a = 0; a < arr.length; a++) {
				for (int b = 0; b < arr[1].length; b++) {
					
					if (a<n-1) {
						arr[a][(3*n-3)-a]='*';
						arr[a][(3*n-3)+a]='*';
					}
					else if (a==n-1 && b%2==0) 
						arr[a][b]='*';
					else if (a>n-1 && a<=2*n-2) {
						arr[a][a-n + 1]='*';
						arr[a][3*n -3-a]='*';
						arr[a][3*n-3+a]='*';
						arr[a][7*n-7-a]='*';
					}
					else if (a>=2*n-2)
						arr[a][b] = arr[4*n-a-4][b];
					else 
						arr[a][b]=' ';
					
					}
				}
			for (int k = 0; k < arr.length; k++) {
				for (int k2 = 0; k2 < arr[1].length; k2++) {
					System.out.print(arr[k][k2]);
				}
				System.out.println();
			}
		}
			
	}
}

