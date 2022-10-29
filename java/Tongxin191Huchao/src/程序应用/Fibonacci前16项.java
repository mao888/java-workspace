package 程序应用;

public class Fibonacci前16项 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j=1,k=1;
		while (k<=15) {
			System.out.print(" "+i+" "+j);
			i=i+j;
			j=i+j;
			k+=2;
			
		}
	}
}
