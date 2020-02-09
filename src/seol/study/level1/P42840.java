package seol.study.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 모의고사.
 * @author seol
 * @see	https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class P42840 {
	
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5}; 
		System.out.println(Arrays.toString(new P42840().solution(answers)));
	}
	
    public int[] solution(int[] answers) {
    	int[][] arrPattern = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
    	int[] cnt = new int[arrPattern.length];
    	
    	for(int i=0; i<answers.length; i++) {
    		for(int j=0; j<arrPattern.length; j++) {
    			int[] ansPattern = arrPattern[j];
    			if(ansPattern[i%ansPattern.length]==answers[i]) {
    				cnt[j]++;
    			}
    		}
    	}
    	
    	int maxCnt = Arrays.stream(cnt).max().orElse(0);
    	int[] answer = {};
    	if(maxCnt>0) {
    		List<Integer> list = new ArrayList<>();
    		for(int j=0; j<arrPattern.length; j++) {
    			if(cnt[j]==maxCnt) {
    				list.add(j+1);
    			}
    		}
    		answer = list.stream().mapToInt(i->i).toArray();
    	}
        return answer;
    }
}