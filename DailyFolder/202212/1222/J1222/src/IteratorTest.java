import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("��", "��", "��");
		
		Iterator<String> it = list.iterator();
		
//		if(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
//		it.next();
//		it.next();
//		it.next();
//		it.next();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		Stream<String> stream = list.stream();
		stream.forEach( (item)->{ System.out.println(item); } );
	
		list.stream().forEach( (item)->{ System.out.println(item); } );
		
		System.out.println("----------------------------------");
		
//���1	for�� ���
		
//		List<Integer> list2 = new ArrayList<Integer>();
//		for(int i=1; i<11; i++) {
//			list2.add(i*10);
//		}

//���2	Stream ���
		
//		List<Integer> list2 = new ArrayList<Integer>();
//		List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		Stream<Integer> stream2 = list5.stream();
//		stream2.forEach( item -> list2.add(item*10));
		
//���3	Iterator ���

		Integer[] arr = new Integer[10];
		for(int i=1; i<arr.length+1; i++) {
			arr[i-1]=i;
		}
		List<Integer> list6 = Arrays.asList(arr);
		List<Integer> list2 = new ArrayList<Integer>();
		Iterator<Integer> iterator2 = list6.iterator();
		while(iterator2.hasNext()) {
			list2.add(iterator2.next()*10);
		}
		
		// filterList �޼ҵ� ȣ��
		List<Integer> resultList = filterList(list2, 35);
		System.out.println(resultList);
		
		
	}
	// filterList �޼ҵ�
	static List<Integer> filterList(List<Integer> list2, int n) {
		
		// list3 ArrayList����
		List<Integer> list3 = new ArrayList<Integer>();
		
		// list3�� ���ǿ� �´� list2�� �߰�
		for(int i=1; i<list2.size(); i++) {
			if(list2.get(i)>=n) {
				list3.add(list2.get(i));
			}
		}
		
		// list3 ����
		return list3;
	}

}
