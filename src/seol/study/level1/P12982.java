package seol.study.level1;

import java.util.Arrays;

/**
 * 예산.
 * @author seol
 * @see	https://programmers.co.kr/learn/courses/30/lessons/12982
 */
public class P12982 {

	public int solution(int[] d, int budget) {
		Arrays.sort(d);
		int answer = 0;
		for (int i : d) {
			if(budget-i >= 0) {
				budget -= i;
				answer++;
			} else {
				break;
			}
		}
		return answer;
	}
}
