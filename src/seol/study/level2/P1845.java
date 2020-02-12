package seol.study.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 폰켓몬
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/1845
 */
public class P1845 {
	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}
		int len = nums.length / 2;
        return set.size() > len ? len : set.size();
    }
	public int solution2(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int selectCnt = nums.length/2;
		for(int i : nums) {
			if(!list.contains(i)) {
				list.add(i);
				if(list.size()==selectCnt) {
					break;
				}
			}
		}
		return list.size();
	}
}