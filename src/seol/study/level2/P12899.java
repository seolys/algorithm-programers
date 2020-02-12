package seol.study.level2;

/**
 * 124 나라의 숫자
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12899
 */
public class P12899 {
	public static void main(String[] args) {
		System.out.println(new P12899().solution(1));
		System.out.println();
		System.out.println(new P12899().solution(2));
		System.out.println();
		System.out.println(new P12899().solution(3));
		System.out.println();
		System.out.println(new P12899().solution(4));
		System.out.println();
		System.out.println(new P12899().solution(5));
		System.out.println();
		System.out.println(new P12899().solution(6));
		System.out.println();
		System.out.println(new P12899().solution(7));
		System.out.println();
		System.out.println(new P12899().solution(8));
		System.out.println();
		System.out.println(new P12899().solution(9));
		System.out.println();
		System.out.println(new P12899().solution(10));
		System.out.println();
	}

	public String solution(int n) {
		String answer = "";
		int value = 0;
		while(n!=0) {
			value = (n-1)%3;
			n = (n-1)/3;
			answer = this.intTo124(value) + answer;
		}
		return answer.replaceAll("2", "4").replaceAll("1", "2").replaceAll("0", "1");
	}
	
	public String intTo124(int i) {
		switch (i) {
		case 0:
			return "1";
		case 1:
			return "2";
		default:
			return "4";
		}
	}
}