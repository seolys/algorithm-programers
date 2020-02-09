package seol.study.level1;

/**
 * 자연수 뒤집어 배열로 만들기.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class P12932 {
	public int[] solution(long n) {
		String[] split = String.valueOf(n).split("");
		int[] answer = new int[split.length];
		int index = 0;
		for(int i = split.length-1; i>=0; i--) {
			answer[index++] = Integer.parseInt(split[i]);
		}
		return answer;
	}
}