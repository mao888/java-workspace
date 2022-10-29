package 决策数后端测试;

import java.util.Scanner;

public class 回文字符串递归 {

    public static void main(String[] args) {
             String s = "";
             System.out.println(isStr2(s, 0));
             
         }
    

    public static boolean isStr2(String str,int index){
    	// 一个一个字符首尾比较，比较完第一个和最后一个字符后，把字符串的第一个和最后一个字符剔除，这样递归进行
    	if (str.length()==0) {	// 空字符
			return false;
		}
        if(str.charAt(0) == str.charAt(str.length() - 1)){
            if(str.length() > 2){
                return isStr2(str.substring(index+1,str.length()-1),0);
            }else return true;
 
        }else {
        	return false;
        }
 
    }

}
