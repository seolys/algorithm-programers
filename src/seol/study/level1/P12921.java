package seol.study.level1;

/**
 * 소수 찾기.
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12921
 */
public class P12921 {
	public int solution(int n) {
		int answer = 1;
		for (int i = 3; i <= n; i+=2) {
			boolean flag = true;
			for(int j=2; j*j<=i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				answer++;
			}
		}
		return answer;
	}
}