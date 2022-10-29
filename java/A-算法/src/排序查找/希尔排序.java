package 排序查找;
//家族二期2020年度述职报告名次抽签专用
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 希尔排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int total = 45;
	        int random = total;
	        Scanner scanner = new Scanner(System.in);
	        Map<Integer, String> result = new HashMap<>();
	        List<Integer> tip = new ArrayList<>();
	        for (int i = 1 ; i <= total; i++) {
	            tip.add(i);
	        }
	        while (tip.size()>0){
	            String name = scanner.next();
	            if (name.equals("#")) {
	                break;
	            }
	            int index = (int)(Math.random()*random);
	            System.out.println(tip.get(index));
	            result.put(tip.get(index), name);
	            tip.remove(index);
	            random--;
	        }
	        List<String> listResult = new ArrayList<>();
	        for (int i = 1; i <= total; i++) {
	            if (result.containsKey(i)) {
	                listResult.add(result.get(i) + "   " + i);
	            }
	        }
	        List<String> group1 = new ArrayList<>();
	        List<String> group2 = new ArrayList<>();
	        List<String> group3 = new ArrayList<>();
	        for (int i = 0; i < 3; i++) {
	            for (int j = i; j < listResult.size() ; j = j+3) {
	                if ( i == 0) {
	                    group1.add(listResult.get(j));
	                }else if ( i == 1 ) {
	                    group2.add(listResult.get(j));
	                }else {
	                    group3.add(listResult.get(j));
	                }
	            }
	        }

	        try {
	            BufferedWriter bw1 = new BufferedWriter(new FileWriter("F:\\rank1.txt"));
	            for (String s : group1) {
	                bw1.write(s);
	                bw1.newLine();
	                bw1.flush();
	            }
	            bw1.close();

	            BufferedWriter bw2 = new BufferedWriter(new FileWriter("F:\\rank2.txt"));
	            for (String s : group2) {
	                bw2.write(s);
	                bw2.newLine();
	                bw2.flush();
	            }
	            bw2.close();

	            BufferedWriter bw3 = new BufferedWriter(new FileWriter("F:\\rank3.txt"));
	            for (String s : group3) {
	                bw3.write(s);
	                bw3.newLine();
	                bw3.flush();
	            }
	            bw3.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
}
