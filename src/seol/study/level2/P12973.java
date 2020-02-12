package seol.study.level2;

import java.util.Arrays;
import java.util.Stack;

/**
 * 짝지어 제거하기
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12973
 */
public class P12973 {
	public static void main(String[] args) {
		System.out.println(new P12973().solution("febdabbadbezzzf"));
	}
	
	public int solution(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char charAt = s.charAt(i);
			System.out.println(Arrays.toString(stack.toArray()) + " " + charAt);
			if(stack.isEmpty() || stack.peek()!=charAt) {
				stack.push(charAt);
			} else {
				stack.pop();
			}
		}
		
		return stack.isEmpty() ? 1 : 0;
		
	}
	
	
}