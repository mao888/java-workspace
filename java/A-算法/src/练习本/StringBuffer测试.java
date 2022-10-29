package Á·Ï°±¾;

import java.util.Iterator;

public class StringBuffer²âÊÔ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		
		StringBuffer sb = new StringBuffer("123456");
		StringBuilder sbd = new StringBuilder(0);
		sb.append(s);
		System.out.println(sb);   // 123456abcd
		sb.insert(2, s);
		System.out.println(sb);   // 12abcd3456abcd
		sb.reverse();
		System.out.println(sb);	  // dcba6543dcba21   Äæ×ª
		
		System.out.println(sb.charAt(0));	// d
		
		sb.setLength(3);
		System.out.println(sb);	  // dcb
		
		StringBuffer cs = new StringBuffer();
		for (int i = 0; i < sb.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				cs.append(c);
			}	
		}
		System.out.println("cs²âÊÔ£º"+cs);
		
	}

}
