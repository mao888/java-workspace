package 练习本;

public class 素数 {

	public static void main(String[ ] args){
		final int MAX = 100;
		int k,j,n;
		System.out.println("2~100以内的素数为");
		System.out.println("2 \t");
		n=1;
		int sum=0;
		for(k=3;k<100;k=k+2) {
			j=3;
			while(j<Math.sqrt(k) && (k % j !=0))
				j++;
			if(j>Math.sqrt(k)){
				System.out.println(k+"\t");
				n++;
				if(n % 10 ==0)
					System.out.println();			
				
			}k = k+2;
		}
		System.out.println("一共"+n+"素数");
	 }
}
