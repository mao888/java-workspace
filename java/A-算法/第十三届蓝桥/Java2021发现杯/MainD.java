package Java2021发现杯;							
		
import java.util.Scanner;						
	
//dejavu的扫雷游戏	
public class MainD {							
	static boolean flag0 = false , flag1 = false;						
	static int n;
  static boolean check(int i,int j) {
		if (arr[i][j]=='*') {
			flag1 = true;
			return true;
		}else {
			flag0 = true;
			int t = arr[i][j]-'0';
			int count = 0;
			for (int x = -1; x <2; x++) {
				for (int k = -1; k < 2; k++) {
					int nx=i+x,ny=j+k;
					if (nx>=0&&nx<n&&ny>=0&&ny<n&&arr[nx][ny]=='*') {
						count++;
					}
				}	
			}
			return t==count;
		}
	}
	
	static char[][] arr;
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();      
		arr = new char [n][n];								
		for (int i = 0; i < n; i++) {			
			String s =sc.next();
			arr[i]= s.toCharArray();	   
		}
//		System.out.println("打印数组");
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (check(i, j)) {
					
				}else {
					System.out.println("NO");
                  return;
				}
			}
		}
		if (flag0&&flag1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}		
	}
}