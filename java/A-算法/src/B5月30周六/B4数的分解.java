package B5月30周六;

public class B4数的分解 {

	public static void main(String[] args) {
		int n = 2019;
		int num = 0;
		for (int i = 1; i < n; i++) {
			if ((i + "").indexOf("2") != -1 || (i + "").indexOf("4") != -1)
				continue;
			for (int j = i + 1; j < n; j++) {
				if ((j + "").indexOf("2") != -1 || (j + "").indexOf("4") != -1)
					continue;
				int k = n - i - j;
				if (i == k || j == k || i == j)
					continue;
				if (k > 0 && (k + "").indexOf("2") == -1 && (k + "").indexOf("4") == -1)
					num++;
			}
		}
		System.out.println(num / 3);
	}
}
