package seol.study.level2;

/**
 * 다음 큰 숫자
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12911
 */
public class P12911 {
	public static void main(String[] args) {
		new P12911().solution(78);
	}
	public int solution(int n) {
		int 기준 = Integer.bitCount(n);
		while(true) {
			int 비교값 = Integer.bitCount(++n);
			if(기준==비교값) {
				return n;
			};
		}
	}
	public int solution2(int n) {
		int 기준 = Integer.toBinaryString(n).replaceAll("0", "").length();
		while(true) {
			int 비교값 = Integer.toBinaryString(++n).replaceAll("0", "").length();
			if(기준==비교값) {
				return n;
			};
		}
	}
}