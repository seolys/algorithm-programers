package seol.study.level1;

import java.util.Arrays;

/**
 * 평균 구하기
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class P12944 {
	public double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}
	public double solution2(int[] arr) {
		double sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum/arr.length;
	}
}