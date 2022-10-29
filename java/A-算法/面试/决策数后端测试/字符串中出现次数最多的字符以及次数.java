package 决策数后端测试;

import java.util.Scanner;

public class 字符串中出现次数最多的字符以及次数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="1444411";
		MaxStr(s);		
	}
	
	public static void MaxStr(String s) {
		// 转化为字符数组。
		char[] c=s.toCharArray();
		// 定义一个数组存次数
		int [] count=new int[c.length];
		
		//把每个对应的值以及次数存下来
		// 从第一个字符开始，遍历字符串,mid==c[j] count[i]++;
		for(int i=0;i<=c.length-1;i++)
		{
			char mid=c[i];
		    for(int j=0;j<=c.length-1;j++)
		    {
		    	if(mid==c[j])
		    	count[i]++;
		    }				
		}
		// 取出count数组的最大值，并且得到下标
		int index=0;
		int max=0;

		for(int i=0;i<=c.length-1;i++)
		{
			if(max<=count[i])
			{
				max=count[i];
				index=i;
			}			

		}
	
		System.out.println("出现最多的字符是："+c[index]+"出现最多的次数是:"+count[index]);
	}

}
