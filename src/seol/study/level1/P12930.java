package seol.study.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 자릿수 더하기.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class P12930 {
	public String solution(String s) {
		return Arrays.stream(s.split(" ", -1)).map(str -> {
			String result = "";
			for(int i=0; i<str.length(); i++) {
				int ch = str.charAt(i);
				if(i%2==0) {
					if(Character.isLowerCase(ch)) {
						result += Character.toString(ch-32);
					} else {
						result += Character.toString(ch);
					}
				} else {
					if(Character.isUpperCase(ch)) {
						result += Character.toString(ch+32);
					} else {
						result += Character.toString(ch);
					}
				}
			}
			return result;
		}).collect(Collectors.joining(" "));
	}
}