package 程序应用;
//水仙花数
//个十百三个数字的立方和等于这个三位数本身
//答案:153 370 371 407
public class Exercise4_6水仙花数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("水仙花数为:");
		for (int i = 100; i < 1000; i++) {
			int sum=0,k,n=i;
			while (n!=0) {
				k=n%10;		//个位
				n=n/10;		//i减1位
				sum+=k*k*k;
			}
			if (i==sum)System.out.println(i+" ");
		}
	}

}
