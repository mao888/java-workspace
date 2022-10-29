package 程序应用;

import java.util.Scanner;

public class 统计大小写字符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char ch[]=new char[10]; 
		for(int i=0;i<10;i++){
			System.out.println("请输入第"+(i+1)+"个字符:");
			String s=scanner.next();
			char c=s.charAt(0);
			ch[i]=c;
		}
		int x=0;
		int y=0;
		int z=0;
		for(int j=0;j<ch.length;j++){
			if(ch[j]>='A'&&ch[j]<='Z'){
				x++;
			}
			else if(ch[j]>='a'&&ch[j]<='z'){
				y++;
			}
			else {
				z++;
			}
		}
		System.out.println("大写字母的个数:"+x);
		System.out.println("小写字母的个数:"+y);
		System.out.println("其他字符的个数:"+z);
		
		String str=" ";
		for(int j=0;j<ch.length;j++){
			str+=ch[j];
		}
		System.out.println("字符串:"+str);
	}

}
