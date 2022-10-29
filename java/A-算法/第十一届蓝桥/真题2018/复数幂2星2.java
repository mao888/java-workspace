package 真题2018;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class 复数幂2星2 {
	public static BigInteger shi=new BigInteger("2");
	public static BigInteger xu=new BigInteger("3");
	public static BigInteger ansshi=new BigInteger("2");
	public static BigInteger ansxu=new BigInteger("3");
	public static BigInteger z=new BigInteger("0");
	public static BigInteger mid;
	public static void app(){
		mid=ansshi;
		ansshi=(ansshi.multiply(shi)).subtract(ansxu.multiply(xu));
		ansxu=(ansxu.multiply(shi)).add(mid.multiply(xu));
	}
	public static void main(String[] args) throws IOException {
		for(int i=1;i<123456;i++){
			app();
		}
		FileWriter wr = new FileWriter("第十一届蓝桥/真题2018/复数幂2.txt");

		wr.write((ansshi+((ansxu.compareTo(z))>=0?"+":"")+ansxu+"i"));
		wr.flush();
	}
}
