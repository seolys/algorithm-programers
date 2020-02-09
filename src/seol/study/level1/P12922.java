package seol.study.level1;

/**
 * 수박수박수박수박수박수?
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class P12922 {
	public String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++)
			answer += i % 2 == 0 ? "수" : "박";
		return answer;
	}
}