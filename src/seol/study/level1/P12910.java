package seol.study.level1;

import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자 배열.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12910
 */
public class P12910 {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i%divisor == 0).sorted().toArray();
        if(answer.length==0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        return answer;
    }
}