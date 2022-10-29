package Java复习;

//100以内的素数
	public class Sushu {

		public static void main(String[] args) {
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