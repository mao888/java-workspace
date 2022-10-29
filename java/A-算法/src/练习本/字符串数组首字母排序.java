package 练习本;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.*;

public class 字符串数组首字母排序 {

	 public static void main(String[] args) {
	        Random random=new Random();
	        String[] str=new String[8];//创建一个长度是8的字符串数组
	        Set<Integer> a = new HashSet<Integer>();
	        //使用8个长度是5的随机字符串初始化这个数组
	        for (int i = 0; i <8; i++) {
	            //随机字符串生成法
	            char c[]=new char[5] ;
	            for (int j = 0; j <5 ; j++) {
	                char temp;
	                if(random.nextInt(2)==0){
	                    //0-1相当于一个判断
	                    temp=(char)(random.nextInt(26)+65);//65-90 大写字母
	                }
	                else
	                    temp=(char)(random.nextInt(26)+97);//97-122 小写字母

	                c[j]=temp;

	            }
	            str[i]=new String(c);
	        }
	        System.out.println(Arrays.toString(str));
	        System.out.println("排序好后的字符串数组是:");

	        for (int i = 0; i < 8; i++)
	        {
	        	
	            int min = i;
	            for (int j = i; j < 8; j++){
	                if(Character.toLowerCase(str[j].toCharArray()[0])<
	                        Character.toLowerCase(str[min].toCharArray()[0])) //比较第一个字母
	                    min=j;
	            }
	            //交换，如果str[j]第一个字母<str[min]第一个字母
	            //这时候min=j;字符串数组中最小的
	            //交换str[i] 和str[min]
	            String temp = str[i];
	            str[i] = str[min];
	            str[min] = temp;
	        }
	        System.out.println(Arrays.toString(str));

	    }

}
