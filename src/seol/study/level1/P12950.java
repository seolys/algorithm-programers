package seol.study.level1;

/**
 * 행렬의 덧셈
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12950
 */
public class P12950 {

	public static void main(String[] args) {
		int[][] int1 = new int[2][1];
		int1[0][0] = 1;
		int1[1][0] = 2;
		int[][] int2 = new int[2][1];
		int2[0][0] = 3;
		int2[1][0] = 4;
		new P12950().solution(int1, int2);
	}

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int len1 = arr1.length;
		int len2 = arr1[0].length;
		int[][] answer = new int[len1][len2];
//		for(int i=0; i<len1; i++) {
//			for(int j=0; j<len2; j++) {
//				answer[i][j] = arr1[i][j] + arr2[i][j];
//			}
//		}
		for(int i=0; i<len1; i++) {
			answer[i] = this.addItem(arr1[i], arr2[i]);
		}
		return answer;
	}

	private int[] addItem(int[] arr1, int[] arr2) {
		int[] answer = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			answer[i] = arr1[i] + arr2[i];
		}
		return answer;
	}
}