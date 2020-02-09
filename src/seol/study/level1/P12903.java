package seol.study.level1;

/**
 * 가운데 글자 가져오기
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12903
 */
public class P12903 {
	public String solution(String s) {
		int i = s.length() / 2;
		if (s.length() % 2 == 0) {
			return s.substring(i - 1, i + 1);
		} else {
			return s.substring(i, i + 1);
		}
	}
}