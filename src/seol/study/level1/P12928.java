package seol.study.level1;

/**
 * 약수의 합.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class P12928 {
    public int solution(int n) {
		int answer = n;
		for(int i = n/2; i > 0; i--) {
			if(n%i==0) {
				answer += i;
			}
		}
		return answer;
	}
}