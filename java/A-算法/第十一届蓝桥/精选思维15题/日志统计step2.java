package 精选思维15题;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class 日志统计step2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int K = sc.nextInt();
		
		int arr[][] = new int [N][5];
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
		}
		for (int i = 0; i < N; i++) {
			int first =1;
			for (int j = i+1; j < N; j++) {
				if (arr[j][1]==arr[i][1]) 
					first++;
					if (j==N-1) 
						arr[i][2]=first;
			}
		}
		for (int i = 0; i < N; i++) {
			if (arr[i][2]>=K)
				arr[i][3]=1;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if (arr[i][3]==1&&arr[i][1]==arr[j][1]&&arr[j][0]-arr[i][0]<D) 
					arr[i][4]=1;
			}
		}
		HashSet<Integer> ar= new HashSet<Integer>(); 
		for (int i = 0; i < N; i++) {
			if (arr[i][4]==1) {
				ar.add(arr[i][1]);
			}
		}
		
		Iterator<Integer> result = ar.iterator();
		while (result.hasNext()) {
			System.out.println(result.next());
		}	
	}
}
