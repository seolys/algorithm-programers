package seol.study.level1;

import java.util.Arrays;

/**
 * x만큼 간격이 있는 n개의 숫자
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class P12954 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new P12954().solution(4, 3)));
	}
	
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		for(int i=1; i<=n; i++) {
			answer[i-1] = x * i;
		}
		return answer;
	}
}