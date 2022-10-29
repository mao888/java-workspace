package Java2021·¢ÏÖ±­;

import java.util.*;

public class MainDwyk{
	static boolean have0=false,have1=false;
	static int n;
	static boolean check(int i,int j){
		if(c[i][j]=='*'){
			have1=true;
			return true;
		}
		else {
			have0=true;
			int t=c[i][j]-'0';
			System.out.println("t"+t);
			int count=0;
			for(int x=-1;x<2;x++){
				for(int y=-1;y<2;y++){
					int nx=i+x,ny=j+y;
					if(nx>=0&&ny>=0&&nx<n&&ny<n&&c[nx][ny]=='*'){
						count++;
						System.out.println("count "+count);
						
					}
				}
			}
			return t==count;
		}
		
	}
	static char c[][];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		c=new char[n][n];
		for(int i=0;i<n;i++){
			String s=sc.next();
			c[i]=s.toCharArray();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(check(i,j)){
					
				}else{
					System.out.println("NO");
					return;
				}
			}
		}
		if(have0&&have1)System.out.println("YES");
		else System.out.println("NO");
	}
}
