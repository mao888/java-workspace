package 剑指OfferII专项突击版;

public class OfferII014字符串中的变位词 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "eidboaoo";
		System.out.println(new OfferII014字符串中的变位词().checkInclusion(s1, s2));
	}
	
	public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        
		StringBuffer sb1 = new StringBuffer(s1);
		sb1=sb1.reverse();
		StringBuffer sb2 = new StringBuffer(s2);
		
		for (int i = 0; i<sb1.length();i++) {
			for (int j = 0; j < sb2.length(); j++) {
				if (sb1.charAt(i)==sb2.charAt(j)) {
					if (sb1.charAt(i+1)==sb2.charAt(j+1)) {
						return true;
					}
				}
			}
		}
		return false;
		}
}