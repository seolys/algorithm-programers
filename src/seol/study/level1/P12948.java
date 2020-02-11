package seol.study.level1;

/**
 * 핸드폰 번호 가리기
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12948
 */
public class P12948 {
	public String solution(String phone_number) {
		return phone_number.substring(0, phone_number.length() - 4).replaceAll(".", "*")
				+ phone_number.substring(phone_number.length() - 4);
	}
}