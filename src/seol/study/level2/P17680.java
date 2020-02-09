package seol.study.level2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 캐시
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/17680
 */
public class P17680 {
	public int solution(int cacheSize, String[] cities) {
		int total = 0;
		
		if(cacheSize==0) {
			return cities!=null ? cities.length*5 : 0;
		}
		
		Deque<String> deque = new LinkedList<String>();
		for(int i=0; i<cities.length; i++) {
			String city = cities[i].toLowerCase();
			
			if(deque.contains(city)) {
				deque.remove(city);
				deque.addLast(city);
				total = total + 1;
			} else {
				total = total + 5;
				
				if(deque.size() < cacheSize) {
					deque.addLast(city);
				} else {
					deque.removeFirst();
					deque.addLast(city);
				}
			}
		}
		
		int answer = total;
		return answer;
	}
}