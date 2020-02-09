package seol.study.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 같은 숫자는 싫어.
 * 
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class P12906 {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();

		int prev = arr[0];
		for (int i = 1, max = arr.length; i < max; i++) {
			if (prev != arr[i]) {
				list.add(prev);
				prev = arr[i];
			}
		}
		list.add(prev);

		return list.stream().mapToInt(i -> i).toArray();
	}
}