package seol.study.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class P42576 {
	public String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String name : participant) {
			if (map.containsKey(name)) {
				int cnt = map.get(name);
				map.put(name, ++cnt);
			} else {
				map.put(name, 1);
			}
		}

		for (String compName : completion) {
			if (map.containsKey(compName)) {
				int cnt = map.get(compName);
				cnt = cnt - 1;
				if (cnt > 0) {
					map.put(compName, cnt);
				} else {
					map.remove(compName);
				}
			} else {
				return compName;
			}
		}

		return map.keySet().iterator().next();
	}
}