import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Marathon{

	public static void main(String[] args) {

		Marathon m = new Marathon();

//		String[] p = {"leo", "kiki", "eden"};
//		String[] c = {"eden", "kiki"};
//		String answer = "leo";

//		String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] c = {"josipa", "filipa", "marina", "nikola"};
//		String answer = "vinko";

		String[] p = { "mislav", "stanko", "mislav", "ana" };
		String[] c = { "stanko", "ana", "mislav" };
		String answer = "mislav";

		String result = m.solution(p, c);
		System.out.println("정답 : " + answer);
		System.out.println("결과 : " + result);
		System.out.println("정답여부 : " + (answer.equals(result)));

	}

	/*
	 * ["leo", "kiki", "eden"] ["eden", "kiki"] "leo" ["marina", "josipa", "nikola",
	 * "vinko", "filipa"] ["josipa", "filipa", "marina", "nikola"] "vinko"
	 * ["mislav", "stanko", "mislav", "ana"] ["stanko", "ana", "mislav"] "mislav"
	 */
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		// HashMap에 
		// p배열을 이용해서 put
		// key를 이름으로 넣고
		// value에 몇번 같은 값이 나왔는지 기록
		// 그 다음에
		// c배열을 이용해서 get
		// value--
		// 최종적으로 0이 아닌애가 정답
		
		
//		// HashMap 연습
//		// 기본
//		Map map = new HashMap();
//		map.put("mislav", 1);
//		
//		System.out.println(map.get("mislav"));
//		System.out.println(map.get("stanko"));
//		// 없는 key를 get하면 null
		
		// 발전
		// 없으면 그냥 put
		// 있으면 ++
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<participant.length; i++) {
			String pMember = participant[i];
			
			if(map.get(pMember) == null) {
				map.put(pMember, 1);
			} else {
				int newValue = map.get(pMember) + 1;
				map.put(pMember, newValue);
			}
		}
		
//		// 출력
//		for(String key : map.keySet()) {
//			System.out.println(key +":"+ map.get(key));
//		}
		
		for(int i=0; i<completion.length; i++) {
			String cMember = completion[i];
			if( map.get(cMember) != null ) {// 문제 구조 상 의미는 없음
				map.put(cMember, (map.get(cMember) - 1));
			}
		}
		// 출력
		for(String key : map.keySet()) {
//			System.out.println(key +":"+ map.get(key));
			if(map.get(key) != 0) {
				answer = key;
			}
		}
		

		return answer;
	}
}
