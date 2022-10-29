package 洛谷;

import java.util.Iterator;
import java.util.Scanner;

public class P3741honoka的键盘 {
	static int n;
	static char []z;
	// 查找kv
	public static int check() {
		int sum=0;
		for (int i = 0; i < n-1; i++) {
			if (z[i]=='V'&&z[i+1]=='K') {
				sum++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//		String s = sc.next();
//		z = s.toCharArray();
//		
//		Scanner sc1 = new Scanner(System.in);
		z = sc.next().toCharArray();
		
		int maxi=check();//先看没有改过的情况
		for(int i=0;i<n;i++){
			if(z[i]=='V'){// 如果是V，就改成K然后用check()检查有多少个VK 
				z[i]='K';
		        maxi=Math.max(maxi,check());//一次次替换 
		        z[i]='V';//最后再还原 
		    }
		    else if(z[i]=='K'){//理由同上 
		        z[i]='V';
		        maxi=Math.max(maxi,check());
		        z[i]='K';
		    }
		 }
		System.out.println(maxi);
	}
}
