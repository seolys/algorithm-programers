package seol.study.level1;

/**
 * 문자열 다루기 기본.
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12918
 */
public class P12918 {
	public boolean solution(String s) {
		return s.matches("(^[0-9]{4,6}$)");
	}
}