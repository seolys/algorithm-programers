package seol.study.level1;

/**
 * 두 정수 사이의 합.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class P12912 {
	public long solution(int a, int b) {
		if (b < a) {
			int temp = a;
			a = b;
			b = temp;
		}
		long answer = a;
		for (int i = a + 1; i <= b; i++) {
			answer += i;
		}

		return answer;
	}
}