public class Java题3{
	public static void main(String[] args) {
		

/*	public static void main(String[] args) 
*	{
*	 TODO Auto-generated method stub
*System.out.println("HelloJava");
*	}
*
*	public static void main1(String[] args) 
*	{
*		;
*		class Jianpan
*		{
*			public void main(String[] args)throws IOException 
*			{
*			float f =3.22f;	// TODO Auto-generated method stub
*			double d=3.1415926;
*			System.out.println(f);
*			char c='二';
*			byte b=123;
*			short s=12345;
*			int i=123123;
*			long h=123456789;
*			char a='x';
*			boolean z=false;
*			System.out.println(d);
*			System.out.println(c);
*			System.out.println(b);
*			System.out.println(s);
*			System.out.println(i);
*			System.out.println(h);
*			System.out.println(a);
*			System.out.println(z);
*			}	
*		}
*
*/	
////10月5日 成绩
//		 /*
//		 * if(判断条件){
//	     * }   else {
//		 *	public class Day02{
//		 *	public static void main(String[] args) {
//		 *  成绩大于90分  输出A      80~90 B
//	     *  60~80 C   60D//
//	     */	 	
////1	年龄
//    int age=18;
//	if (age == 18)
//		System.out.println("可以访问本网站");
//	else
//	System.out.println("不可以访问本网站");
//	
//	
////2	成绩等级
//	System.out.println("请输入您的成绩");
//	Scanner sc = new  Scanner(System.in);
//	
//	int grade = sc.nextInt();
//	if(grade>90) {
//		System.out.println('A');
//	}else if (grade>80) {
//		System.out.println('B');
//	}else if (grade>60) {
//		System.out.println('C');
//	}else  {
//		System.out.println('D');
//			}
//		}

//3下午
//1 反三位数
/*import java.util.Scanner;
*public class Zuoye2 {
*	public static void main(String[] args) {
*	System.out.println("请用户输入三个数字");
*		Scanner sc = new Scanner(System.in);
*		int a = sc.nextInt();
*		int b = sc.nextInt();
*		int c = sc.nextInt();
*		if (a > b && a > c ) { 
*		       System.out.println(a);
*		}else if(b > a && b>c) {
*			System.out.println(b);
*		}else if(c > a && c>b) {
*			System.out.println(c);
*			}
*		}
*	}
*/
//2 反四位数
//
//		System.out.println("请用户输入一个四位数");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		int qianwei = a/1000; 
//		int baiwei = a/100%10; 
//		int shiwei = a/10%10;
//		int gewei = a%10; 
//		int b = qianwei+baiwei*10+shiwei*100+gewei*1000;
//		System.out.println(b);

//3
//
//		for (int i = 0; i < 100; i++) {
//			
//			System.out.println(i);
//		}
//4		
	
/*		public class Guoqing训练 {
*public void main(String[] args) {
*				for (int i = 1; i < 1000  ; i++) {
*					if (i%3==0&&i%5==0&&i%7==0) {
*						System.out.println(i);
*					}
*				}
*			}
*		}
*/
		
//10月6日
	//1   反四位数 升级版
		
		//import java.util.Scanner;

		/*public class B {
	*
	*		public static void main(String[] args) {
	*			System.out.println("请用户输入一个四位数");
	*
	*			Scanner sc = new Scanner(System.in);
	*			int a = sc.nextInt();
	*			while (!(999 < a && a <10000)) {
	*	System.out.println("你的输入有误");
	*	System.out.println("请输入一个四位数");
	*	a= sc.nextInt();
	*	}
	*int qianwei = a/1000; 
	*int baiwei = a/100%10; 
	*int shiwei = a/10%10;
	*int gewei = a%10; 
	*int b = qianwei+baiwei*10+shiwei*100+gewei*1000;
	*System.out.println(b);
	*			}
		}*/
//2
//		public class 
// {
//			public static void main1(String[] args) {
//						int[] arr = {
//								6,2,66,67,68,69,9,60,9,74,4,7,8,1
//						};
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 != 0 ) {
//				System.out.println(arr[i]);
//			}
//			
//		}
//						}
//				}	
//int arr[] = new int[100];
//		for (int i = 0; i < arr.length; i++  ) {
//		arr[i] = i;
//		System.out.println(arr[i]);
//		System.out.println(arr[i]);
//		}
//	}
//	
//	
	
//10.10 
///1 100以内的素数
	/*public class Sushu {
*
*		public static void main(String[] args) {
			int Max = 100;										 //定义常量Max=100
			int j, k ,n;
			System.out.println("2~"+Max+"之间的所有素数为：");
			System.out.print("2\t");							//2是第一个素数，不需测试直接输出
			n = 1;												//n累计素数的个数
			k = 3;										//k是被测试数，从最小奇数3开始，所有偶数不需要测试
			do											//外层循环,从3~100进行素数测试
			{
				j = 3;									//用j去除待测试数
				while (j<Math.sqrt(k) && (k % j!=0))	//内层循环
					j++;								//若j< ,且j不能整除k，则j加1，再测试去除k
				if (j>Math.sqrt(k)) {
					System.out.println(k + "\t");
					n++;
					if(n%10 == 0)System.out.println();  //每行输出10个数
				}
				k=k+2;									//测试下一个奇数
				}while(k<Max);
			System.out.println("\n共有"+n+"个素数");
			}
		}


//2
 * 
 */
/*import java.util.Scanner;
*public class Zuoye2 {
*	public static void main(String[] args) {
*		System.out.println("请输入100以内的素数");
*		Scanner sc = new Scanner(System.in);
*		int num = sc.nextInt();
*		boolean b = false;
*	for (int i = 2; i < num; i++) {
*		if (num % i ==0) {
*			b = true;
*				}
*			}
*	if (b == true) {
*		System.out.println("不是素数");
*	}else {
*		System.out.println("是素数");
*				}
*			}
*		}	
*/

//3
/*import java.util.Scanner;
*public class T1 {
*	public static void main(String[] args) {
*		Scanner sc = new Scanner(System.in);
*		int a = sc.nextInt();
*		int b = sc.nextInt();
*		int c = sc.nextInt();
*		if (a >= b && a >= c ) {
*			System.out.println(a);**		}
*		else if (b >= c && b >= a ) {		System.out.println(b);
*		}else {
*			System.out.println(c);
*				}
*			}
*		}
*/

//4
//public class Java题库 {
//
//	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print("*");
//				
//			}System.out.println();
//
//			
//		}
//	}
//
//}
//5
//1数组求和
//public class B{
//public static void main(String[] args) {
//	int art[] = {1,5,5,5,58,5,5,54,6,5,468,46,4,4,64,46,46,44,4,64,4,84,84,4,84,46};
//	int sum =0 ;
//	for (int i = 0; i < art.length; i++) {
//		sum =sum+i;
//	}
//	System.out.println(sum);
////2找出数组中的最大数
//	int mac = art[0];
//	for (int i = 0; i < art.length; i++) {
//		if (art[i]>mac) {
//			mac = art[i];
//		}	
//	}System.out.println(mac);
////3找出数组中只出现了一次的那个数
//	int L=8848;
//	for (int i = 0; i < art.length; i++) {
//		L = L^art[i];
//	}
//	System.out.println(L^8848);
////4 
//	int arr[] = new int [10];
//	System.out.println(arr[0]);
//
//	
	
//10.11
	//乘法表
/*public class Chenfabiao{
*		public static void main(String[] args) {
*			for (int i = 1; i < 10; i++) {
*			for (int j = 1; j <=i; j++) {
*			System.out.print(i+"*"+j+"="+i*j+"\t");
*				
*				}System.out.println();	
*			}
*		}
*	}
*/

//10.13
	//从键盘输入n个数，输出这些数中大于其平均值得数
	/*import java.util.Scanner;
	*public class Chenfabiao{
	*		public static void main(String[] args) {
	*			System.out.println("你想输入几个整数");
	*			Scanner scanner =new Scanner(System.in) ;
	*			int count =scanner.nextInt();
	*			int sum =0;
	*			int num[]=new int[count];
	*			float avg=0;
	*			for (int i = 0; i < count; i++) {
	*				System.out.println("请输入第"+(i+1)+"个整数");
	*			num[i]=scanner.nextInt();
	*			sum+=num[i];
	*			}avg=sum/count;
	*			for (int i = 0; i < count; i++) {
	*				if (num[i]>avg) {
	*					System.out.print(num[i]+"");
	*				}
	*			}
	*		}
	*	}
    */

	
	//从键盘输入n个数，求这n个数中的最大数与最小数并输出
	//import java.util.Scanner;
//	public class T1 {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("请输入n个数");
//			int n = sc.nextInt();
//			int num[] = new int[n];
//			for (int i = 0; i < n; i++) {
//				num[i] = sc.nextInt();
//			}
//			int min = 0;
//			int max = 0;
//			int b[] = new int[n];
//			for (int i = 0; i < n; i++) {
//				System.out.println("请输入第" + (i + 1) + "个整数");
//				b[i] = sc.nextInt();
//			}
//			min = max = b[0];
//			for (int i = 1; i < n; i++) {
//				if (min > b[i]) {
//					min = b[i];
//				}
//				if (max < b[i]) {
//					max = b[i];
//				}
//			}
//			System.out.println(min + "  " + max);
//		}
//	}
//	



//编写java应用程序，比较命令行中给出的两个字符串是否相等，并输出比较的结果
/*	import java.util.Scanner;
*	public class A{
*		public static void main(String[] args) {
*			Scanner sc = new Scanner(System.in);
*			System.out.println("请输入第一个字符串");
*		    String a = sc.nextLine();
*		    System.out.println("请输入第二个字符串");
*		   	String b = sc.nextLine();
*		    if (a.equals(b)) {
*				System.out.println("两个字符串相等");
*			}else {
*				System.out.println("两个字符串不相等");
*			}
*		}
*	}
*/

	
//10月24至25日	
//Callatz卡拉兹猜想
//法一	
//	package Java复习;
//	import java.util.Scanner;
//	public class Callatz卡拉兹猜想 {
//		public static void main(String[] args) {
//			int a ;
//			Scanner reader = new Scanner(System.in);
//			a = reader.nextInt();
//			for(int i = 1; i < 1000; i ++) {
//				if(a != 1) {
//					if(a % 2 == 0) {
//						a = a/2;
//					}
//					else {
//						a = (3 * a + 1)/2;
//					}
//					if(a == 1) {
//						System.out.println(i);
//						break;
//					}
//				}
//				if(a == 1) {
//					System.out.println(0);
//					break;
//				}
//			}
//		}
//	}

//法二
//	package Java复习;
//	import java.util.Scanner;
//	public class A {
//		public static void main(String[] args) {
//			System.out.println("请您给定正整数的值");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a = 0;
//		while (n!=1) {
//		if (n%2 == 0) {
//		  n=n/2;
//			a+=1;	
//		}else {
//			n=(n*3+1)/2;
//			a+=1;
//				}
//			}
//		System.out.println(a);
//		}
//	}
//			


	
	
	
//10月26日
//分段函数	
//	package Java复习;
//
//	import java.util.Scanner;
//
//	public class B分段函数 {
//
//		public static void main(String[] args) {
//			double y;
//			System.out.println("请输入X的值");
//			Scanner sc = new Scanner(System.in);
//			double x = sc.nextDouble();
//			if (0 <= x && x < 20) {
//				if (0 <= x && x < 5) {
//					y = -x + 2.5;
//				} else if (5 <= x && x < 10) {
//					y = 2 - 1.5 * (x - 3) * (x - 3); 
//				} else {
//					y = x / 2 - 1.5;
//				}System.out.println(y);
//				}
//			
//		}
//	}
//
	
	//摄氏温度与华氏温度的转换
//	package Java复习;
//	import java.util.*;
//	public class C摄氏温度与华氏温度的转换 {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("请输入目前需要转换的温度类型：C或F");
//			String s = sc.next();
//			if("C".equalsIgnoreCase(s)) {
//				System.out.println("请输入需要转换的摄氏度的温度数值");
//				double wd1=sc.nextDouble();
//				double wd2=wd1*1.8+32;
//				System.out.println("对应的华氏温度："+ wd2  +"华氏摄氏度");
//			}
//			else if ("F".contentEquals(s))
//				 {
//				System.out.println("请输入需要转换的华氏摄氏度的温度数值");
//				double hd1=sc.nextDouble();
//				double hd2=(hd1-32)/1.8;
//				System.out.println("对应的摄氏温度为："+  hd2 +"摄氏度");
//			}
//			else {
//				System.out.println("你输入的字符有误，请退出程序！");
//				break;
//				}
//			}		
//		}
//	}
	}
	}
	
	
	