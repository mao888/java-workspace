   package Vj”Ô∑®;

import java.util.Scanner;

public class J2 {
	public static boolean arr[] = new boolean[30000];
	public static void name() {
		for (int i = 2; i < arr.length; i++) arr[i]=true;
		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; i*j < arr.length; j+=i)arr[i*j]=false; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		name();
		while (sc.hasNext()) {
			int x = sc.nextInt(),y=sc.nextInt();
			if (x==0&&y==0)break;
			boolean All = true;
			for (int i = x; i <= y; i++) {
				if(!arr[i*i+i+41]) All=false;
			}
			System.out.println(All?"OK":"Sorry");
		}
	}
}
