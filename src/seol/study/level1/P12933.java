package seol.study.level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 정수 내림차순으로 배치하기.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12933
 */
public class P12933 {
	public long solution(long n) {
		String[] split = String.valueOf(n).split("", -1);
		String reverseStr = Arrays.stream(split)
									.sorted(Comparator.reverseOrder())
									.reduce((acc, s) -> acc+s)
									.orElse("0");
		return Long.parseLong(reverseStr);
	}
}