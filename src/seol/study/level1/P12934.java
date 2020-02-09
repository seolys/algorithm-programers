package seol.study.level1;

/**
 * 정수 제곱근 판별.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12934
 */
public class P12934 {
	public static void main(String[] args) {
		System.out.println(new P12934().solution(121));
	}
	public long solution(long n) {
		double sqrt = Math.sqrt(n);
		if((int)sqrt == sqrt) { // 소수점이 없으면 제곱근
			return (long) Math.pow(sqrt+1, 2);
		} else {
			return -1;
		}
	}
}