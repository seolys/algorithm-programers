package seol.study.level1;

import java.util.Arrays;

/**
 * 문자열 내 마음대로 정렬하기.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12915
 */
public class P12915 {
	public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
	        		  .sorted((str1, str2) -> str1.compareTo(str2))
                      .sorted((str1, str2) -> str1.substring(n, n+1).compareTo(str2.substring(n, n+1)))
                      .toArray(String[]::new);
    }
}