package seol.study.level1;

/**
 * 문자열을 정수로 바꾸기
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class P12925 {
	public int solution(String s) {
	      int answer = 0;
	      String first = s.substring(0,1);
	      if(first.equals("+") || first.equals("-")){
	          s = s.substring(1);
	      }
	      answer = Integer.parseInt(s);
	      return first.equals("-") ? answer*-1 : answer;
	  }
}