package Java复习;
import java.util.*;
public class C摄氏温度与华氏温度的转换 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println("请输入目前需要转换的温度类型：C或F");
		String s = sc.next();
		if("C".equalsIgnoreCase(s)) {
			System.out.println("请输入需要转换的摄氏度的温度数值");
			double wd1=sc.nextDouble();
			double wd2=wd1*1.8+32;
			System.out.println("对应的华氏温度："+ wd2  +"华氏摄氏度");
		}
		else if ("F".contentEquals(s))
			 {
			System.out.println("请输入需要转换的华氏摄氏度的温度数值");
			double hd1=sc.nextDouble();
			double hd2=(hd1-32)/1.8;
			System.out.println("对应的摄氏温度为："+  hd2 +"摄氏度");
		}
		else {
			System.out.println("你输入的字符有误，请退出程序！");
			break;
			}
		}		
	}
}
