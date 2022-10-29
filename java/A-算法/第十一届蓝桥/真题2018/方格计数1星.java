package 真题2018;

public class 方格计数1星 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				if (Math.sqrt(i*i+j*j)<=1000) {
					count++;
				}
			}
		}
		System.out.println(Integer.MAX_VALUE);
//		System.out.println(count*4);
		int []a= {1,2,5,92,12};
		
	}

}
