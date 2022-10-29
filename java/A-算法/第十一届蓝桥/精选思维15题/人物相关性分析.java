package 精选思维15题;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class 人物相关性分析 {

	private static String getTemplateContent() throws Exception {
		File file = new File("C:\\Users\\王小明\\Desktop\\算法蓝桥\\step2评测标准\\人物相关性分析测评标准\\data8.in");
		if(!file.exists())
			return null;
		FileInputStream inputStream = new FileInputStream(file);
		int length = inputStream.available();
		byte bytes[] = new byte[length];
		inputStream.read(bytes);
		inputStream.close();
		String str = new String(bytes, StandardCharsets.UTF_8);
		return str;
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int num = 0;
		sc.nextLine();
		String first_paragraph = getTemplateContent();
		long start_time = System.currentTimeMillis();
		StringBuilder paragraph = new StringBuilder(first_paragraph);
		for (int i = 0; i < paragraph.length(); i++) {
			char temporary = paragraph.charAt(i);
			if(temporary == '.' || temporary == ',' || temporary == '?' || temporary == '!' || temporary == ':' || temporary == ';') {
				 {
					paragraph.insert(i, " ");
					paragraph.insert(i + 2, " ");
					i += 3;		
				}
			}
		}
		String[] stringList ;
		stringList = paragraph.toString().split(" ");

		for (int i = 0; i < stringList.length - 1; i++) {
			int length = 0;
			if(stringList[i].equals("Alice")){
				for (int j = i + 1; j < stringList.length; j++) {
					length += 1 + stringList[j].length();
					if(length <= K + 3 && stringList[j].equals("Bob")) {
						num ++;
						break;
					}
					else if(length > K)
						break;	
				}
			}
			
			else if(stringList[i].equals("Bob")) {
				for (int j = i + 1; j < stringList.length; j++) {
					length += 1 + stringList[j].length();
					if(length <= K + 5 && stringList[j].equals("Alice")) {
						num ++;
						break;
					}
					else if(length > K)
						break;
				}
			}
		}
		long end_time = System.currentTimeMillis();
		long times = (end_time - start_time) / 1000;
		System.out.println(num);
		System.out.println(times);
		
	}
}
