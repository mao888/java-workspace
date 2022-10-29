package 泛型与容器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 遍历ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list =new ArrayList<String>();
		list.add("Hello");
	    list.add("World");
	    list.add("HAHAHAHA");
	  //第一种遍历方法使用 For-Each 遍历 List
	     for (String str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
	        System.out.println(str);
	     }
	     
	   //第二种遍历，把链表变为数组相关的内容进行遍历
	     String[] strArray=new String[list.size()];
	     list.toArray(strArray);
	     for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray) 这种形式
	     {
	        System.out.println(strArray[i]);
	     }
	     
	     //第三种遍历 使用迭代器进行相关遍历
	     Iterator<String> ite=list.iterator();
	     while(ite.hasNext())//判断下一个元素之后有值
	     {
	         System.out.println(ite.next());
	     }  
	     
	     
	     
	}

}
