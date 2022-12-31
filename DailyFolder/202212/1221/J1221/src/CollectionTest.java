import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(1);
		list.add("이");
		list.add(3.14);
		
		int a = (int) list.get(0);
		String b = (String)list.get(1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(1);
		list2.add(2);
		
		int c = list2.get(0);
		System.out.println(list2.size());
	}

}
