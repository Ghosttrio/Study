package expert1;

public class exam6 {

	public static void main(String[] args) {
		System.out.println("-------------------------");
		String[] members = new String[] {"a","b","c","d","e"};
		System.out.println("members: "+ members.length);
		int[] 득표배열 = new int[members.length];
		
		for(int i=0; i<20; i++) {
			int 당첨번호 = (int) (Math.random()*members.length);
			득표배열[당첨번호] = 득표배열[당첨번호] + 1;
		}
		
		int boss_index = -1;
		int vote_value = -1;
		
		for(int i=0; i<members.length; i++) {
			if(득표배열[i] > vote_value) {
				vote_value = 득표배열[i];
				boss_index = i;
			}
			System.out.println("name : "+ members[i] + ", vote : "+ 득표배열[i]);
		}
		System.out.println(members[boss_index]);
	}

}
