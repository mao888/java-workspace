package 真题2019;

public class 数的分解2星 {
	public static boolean check(int k) {
		while (k>0) {
			if (k%10==2||k%10==4) {
				return false;
			}
			k=k/10;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  sum = 2019;
		int ans=0;
		for (int i = 1; i <672; i++) {
			sum-=i;
			for (int j = i+1; j <1009; j++) {
				sum-=j;
				if ((sum>j&&j>i)&&check(i)&&check(j)&&check(sum)) {
					ans++;
				}
				sum+=j;
			}
			sum+=i;
		}
		System.out.println(ans);
	}
}
