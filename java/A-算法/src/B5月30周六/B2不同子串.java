package B5月30周六;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class B2不同子串
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        
        List<String>list = new ArrayList<>();
        for(int i=0;i<string.length();i++)//截取的开始位置
        {
            for(int j=1;j<=string.length();j++)//截取的长度
            {
                if(i+j<=string.length())//不会超出字符串的长度
                {
                    int end = i+j;
                    String str1 = string.substring(i,end);//截取字符串
                    
                    if(list.indexOf(str1) == -1) //判断该子串是否在list中，是返回下标，不是返回-1,存入list中
                    {
                        list.add(str1);
                    }
                    
                }
                else                     //超出长度
                {
                    break;
                }
                
            }
        }
        
        for(String str2 : list)
        {
            System.out.println(str2);
        }
        System.out.println();
        int count = list.size();//获取list的长度
        System.out.println(count);
        
    }

}