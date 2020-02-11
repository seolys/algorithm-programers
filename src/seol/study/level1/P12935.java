package seol.study.level1;

/**
 * 제일 작은 수 제거하기
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12935
 */
public class P12935 {
	public int[] solution(int[] arr) {
		if(arr.length<=1) {
			return new int[] {-1}; 
		}
		
		int min = arr[0];
		int cnt = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				cnt = 1;
			} else if(arr[i]==min) {
				cnt++;
			}
		}
		
		int[] answer = new int[arr.length - cnt];
		int index = 0;
		for(int i : arr) {
			if(i > min) {
				answer[index++] = i;
			}
		}
		return answer;
	}
	
}