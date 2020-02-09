package seol.study.level1;

/**
 * 2016년
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class P12901 {
	public String solution(int a, int b) {
        String[] date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int day = 0;
        for(int i=0; i<a-1; i++) {
            day += month[i];
        }
        
        int i = (day + b) % 7;
        if(i>2) {
        	return date[(day + b) % 7 - 3];
        } else {
        	return date[(day + b) % 7 + 4];
        }
    }
}