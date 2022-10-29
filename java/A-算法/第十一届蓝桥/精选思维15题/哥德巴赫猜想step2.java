package 精选思维15题;
//方法一:
import java.util.Scanner; 
public class 哥德巴赫猜想step2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int middle = n / 2;
		int[][] arr = new int[middle][3];
		for (int i = 3; i <= middle; i++) {    
			arr[i - 3][0] = i;    
			arr[i - 3][1] = n - i;   
			}
		for (int i = 0; i < arr.length; i++) {    
			for (int j = 2; j < arr[i][0]; j++) {     
				if(arr[i][0] % j != 0 && arr[i][0] - j == 1) {  
					for (int k = 2; k < arr[i][1]; k++)
						if(arr[i][1] % k != 0 && arr[i][1] - k == 1)       
							arr[i][2] = 1;     
					}    
				}   
			}
		for (int i = 0; i < arr.length; i++) {    
			if(arr[i][2] == 1)   
				System.out.println(arr[i][0] + " " + arr[i][1]);     
				break; 
				
		}
	}
}
