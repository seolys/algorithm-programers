package seol.study.level1;

/**
 * 문자열 내 p와 y의 개수.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12916
 */
public class P12916 {
	public boolean solution(String s) {
        return s.replaceAll("[^pP]", "").length() == s.replaceAll("[^yY]", "").length();
    }
}