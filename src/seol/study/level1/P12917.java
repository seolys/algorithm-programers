package seol.study.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 문자열 내림차순으로 배치하기.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12917
 */
public class P12917 {
	public String solution(String s) {
    	return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }
}