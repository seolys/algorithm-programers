package seol.study.level2;

import java.util.Arrays;

/**
 * 주식가격
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/42584
 */
public class P42584 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new P42584().solution(new int[] {1, 2, 3, 2, 3})));
	}
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length; j++) {
				if(prices[i] > prices[j]) {
					answer[i]++;
					break;
				} else {
					answer[i]++;
				}
			}
		}
		return answer;
	}
}