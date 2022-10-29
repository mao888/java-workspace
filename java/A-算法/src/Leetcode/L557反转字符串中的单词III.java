package Leetcode;
		
public class L557反转字符串中的单词III {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest";
//		String a[] = s.split(" ");
//		for (String string : a) {
//			System.out.println(string);
//		}
		reverseWords(s);
	}	
		
    public static String reverseWords(String s) {
    	StringBuffer sb = new StringBuffer();
    	String a[] = s.split(" ");
    	
    	for (int i = 0; i < a.length; i++) {
			StringBuffer sb2 = new StringBuffer(a[i]);
			sb2 = sb2.reverse();
			if (i!=a.length-1) {
				sb.append(sb2+" ");
			}else {
				sb.append(sb2);
			}
    	}
    	s = sb.toString();
    	return s;
    }	
    	
}		