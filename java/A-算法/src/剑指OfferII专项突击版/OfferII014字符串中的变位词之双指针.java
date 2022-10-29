package 剑指OfferII专项突击版;

public class OfferII014字符串中的变位词之双指针 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean checkInclusion(String s1, String s2) {
    	int n = s1.length();
    	int m = s2.length();
    	int cnt[] = new int[26];
    	for(int i=0;i<n;i++) {
    		cnt[s1.charAt(i)-'a']--;
    	}
    	int left = 0;
    	for(int right=0;right<m;right++) {
    		int in = s2.charAt(right)-'a';
    		cnt[in]++;
    		while(cnt[in]>0) {
    			cnt[s2.charAt(left)-'a']--;
    			left++;
    		}
    		if (right-left+1==n) {
				return true;
			}
    	}
    	return false;
    }
}
