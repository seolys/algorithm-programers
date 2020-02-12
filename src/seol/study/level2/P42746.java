package seol.study.level2;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 가장 큰 수
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class P42746 {
	public static void main(String[] args) {
		System.out.println(new P42746().solution(new int[] {3, 30, 34, 5, 9}));
	}
	public String solution(int[] numbers) {
		String numstr = Arrays.stream(numbers)
						.mapToObj(i -> String.valueOf(i))
						.sorted((v1, v2) -> (v2+v1).compareTo(v1+v2))
						.collect(Collectors.joining());
		if(numstr.replaceAll("0", "").length()==0) {
			return "0";
		} else {
			return numstr;
		}
	}
}