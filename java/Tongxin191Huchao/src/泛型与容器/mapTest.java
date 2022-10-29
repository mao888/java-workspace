package 泛型与容器;

//统计单词出现的次数
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class mapTest {
	
//	private static final Integer ONE=new Integer(1);
		//解包
	private static final int ONE=1;
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put("aaa", null);m.put("bbb", null);m.put("ccc",null);
		m.put("aaa", null);m.put("ddd", null);m.put("ccc",null);m.put("ccc", null);
		
		for (int i = 0; i < args.length; i++) {
//			Integer freq = (Integer) m.get(args[i]);
			int freq = (Integer)m.get(args[i]) == null? 0 : (Integer)m.get(args[i]);
//			m.put(args[i], (freq==null?ONE:new Integer(freq.intValue()+1)));
			m.put(args[i], freq==0 ?ONE : freq+1);
		}

		System.out.println(m.size()+"  个单词被探测到了:");
		System.out.println(m);
	}
}
