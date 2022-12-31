import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("key1", 1);
		map.put(2, "A");
		
		int a = (int)map.get("key1");
		String a1 = (String)map.get(2);
		System.out.println(a +" "+ a1);
		
		map.put("key1", 100);
		a = (int) map.get("key1");
		System.out.println(a +" "+ a1);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("data", 10);
		int e = map2.get("data");
		System.out.println(e);
		
		List<Integer> list3 = new ArrayList();
		list3.add(10);
		list3.add(20);
		
		Map<String, List<Integer>> map3 = new HashMap<String, List<Integer>>();
		map3.put("list", list3);
		List<Integer> list3_1 = map3.get("list");
		Integer second = list3_1.get(1);
		System.out.println(second);
		
		Map map_ko = new HashMap();
		map_ko.put("love", "사랑");
		map_ko.put("hate", "증오");
		
		Map map_en = new Hashtable();
		map_en.put("love", "love");
		map_en.put("hate", "hate");
		
		trans(map_ko, "love");
		trans(map_en, "love");
	}
	
	static void trans(Map map, String key) {
		System.out.println(map.get(key));
	}

}
