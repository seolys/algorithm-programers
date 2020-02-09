package seol.study.level1;

/**
 * 시저 암호.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12926
 */
public class P12926 {
	public String solution(String s, int n) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			int charIndex = s.charAt(i);
			if(charIndex==32) {
				answer += " ";
				continue;
			}
			int standard = 0;
			if(Character.isUpperCase(charIndex)){
				standard = 'A';
			} else {
				standard = 'a';
			}
			answer += Character.toString(((charIndex + n) - standard) % 26 + standard);
		}
		return answer;
	}
}