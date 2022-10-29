package 练习本;
import java.util.Scanner;
public class 数字求和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n,sum;
 	    Scanner sc=new Scanner(System.in);
 	    System.out.println("Enter a number ");
 	    n=sc.nextLong();
       for(sum=0 ;n!=0 ;n/=10)
       {
    	   sum+=n%10;
       }
       System.out.println("Sum of digits of a number is "+sum);      
	}

}
