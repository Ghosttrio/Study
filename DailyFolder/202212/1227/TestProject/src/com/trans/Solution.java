package com.trans;
import java.util.Arrays;

class Solution {
	
   	public static String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
    	Arrays.sort(completion);

		int i;
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				break;
			}
		}		
   		return participant[i];
	}
   
}