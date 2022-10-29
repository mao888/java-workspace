package 程序应用;

public class Exercise4_6水仙花数2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a;
		  int ge,shi,bai,qian;
		  for(a=1000;a<10000;a++) {
		     ge=a%10;
		    shi=a/10%10;
		    bai=a/10/10%10;
		      qian=a/1000;
		    if(ge*ge*ge+shi*shi*shi+bai*bai*bai+qian*qian*qian==a) {
		      System.out.println(a);
		      
		    }
		  }
	}

}
