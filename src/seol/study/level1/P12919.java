package seol.study.level1;

/**
 * 서울에서 김서방 찾기.
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12919
 */
public class P12919 {
	public String solution(String[] seoul) {
		int i = 0;
		for (String str : seoul) {
			if ("Kim".equals(str)) {
				return "김서방은 " + i + "에 있다";
			} else {
				i++;
			}
		}
		return null;
	}
}