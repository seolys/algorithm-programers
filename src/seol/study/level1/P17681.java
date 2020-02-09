package seol.study.level1;

/**
 * 비밀지도.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class P17681 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
//			String formatStr = "%0"+n+"d";
			String binaryStr = Integer.toBinaryString(arr1[i] | arr2[i]);
			
			while(binaryStr.length()<n) {
				binaryStr = "0" + binaryStr;
			}
			
//			binaryStr = String.format(formatStr, Integer.parseInt(binaryStr));
			answer[i] = binaryStr.replaceAll("1", "#").replaceAll("0", " ");
			
//			System.out.println(binaryStr.replaceAll("1", "#").replaceAll("0", " "));
		}
		return answer;
	}
}