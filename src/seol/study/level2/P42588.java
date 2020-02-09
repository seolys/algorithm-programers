package seol.study.level2;

/**
 * 탑
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/42588
 */
public class P42588 {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		
		for(int i=1; i < heights.length; i++) {
			int max = heights[i];
			for(int j=i-1; j>=0; j--) {
				if(heights[j] > max) { // 수신완료
					answer[i] = j+1;
					break;
				}
			}
		}
		
        return answer;
	}
}