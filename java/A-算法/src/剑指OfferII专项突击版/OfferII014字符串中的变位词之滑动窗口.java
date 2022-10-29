package 剑指OfferII专项突击版;

public class OfferII014字符串中的变位词之滑动窗口 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public boolean checkInclusion(String s1, String s2) {
    	int m = s1.length();
    	int n = s2.length();
    	if (m>n) {
			return false;
		}
    	int cnt1[] = new int[26];
    	for (char c:s1.toCharArray()) {
    		cnt1[c - 'a']++;
		}
    	int left = 0;
    	int cnt2[] = new int[26];
    	for(int right =0;right < n;right++) {
    		int idx = s2.charAt(right) - 'a';
    		cnt2[idx]++;
    		while (cnt2[idx]>cnt1[idx]) {
				cnt2[s2.charAt(left)-'a']--;
				left++;
			}
    		if (right-left+1==m) {
				return true;
			}
    	}
    	return false;
    }

}
