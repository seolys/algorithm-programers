package seol.study.level1;

import java.util.Arrays;

/**
 * 자릿수 더하기.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class P12931 {
	public int solution(int n) {
		String[] split = String.valueOf(n).split("");
		return Arrays.stream(split)
						.map(Integer::parseInt)
						.reduce((acc, s) -> acc+s)
						.orElse(0);
	}
}