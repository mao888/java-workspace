//第七题（大数）
//又有一天，学妹来问坤坤：“指数爆炸是不是数据膨胀得最快的？”
//坤坤说：“有好多数据膨胀的都要比指数爆炸要快，比如阶乘，17的阶乘int就已经放不下了。”
//学妹又问：“那学长你知道2019的阶乘是多少吗？”
//这怎么能难倒坤坤呢？由于数据太大，坤坤把最后结果对1000000000000000007取余数。你知道答案是多少吗？


package JBfaxianbei;

import java.math.BigInteger;
//大数运算，java特有API
public class G {
	public static BigInteger jc(BigInteger n) {
		if(n.equals(BigInteger.ONE))return BigInteger.ONE;
		else return n.multiply(jc(n.subtract(BigInteger.ONE)));
	}
	public static void main(String[] args) {
		BigInteger n=new BigInteger("2019");
		BigInteger mod=new BigInteger("1000000000000000007");
		System.out.println(jc(n).mod(mod));
	}
}
