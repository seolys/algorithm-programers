package seol.study.level1;

/**
 * 문자열 압축.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/60057
 */
public class P60057 {
	public int solution(String s) {
    	int length = s.length();
    	int answer = length;
    	
    	for(int i=1; i<=length/2; i++) {
    		String result = "";
    		String prev = "";
    		int cnt = 1;
    		for(int j=0; j < length; j+=i) {
    			if((j+i)>length) {
    				prev += s.substring(j);
    				break;
    			} else {
    				String subStr = s.substring(j, j+i);
    				if(!prev.equals(subStr)) {
    					result += cnt==1 ? prev : String.valueOf(cnt) + prev; 
    					prev = subStr;
    					cnt = 1;
    				} else {
    					cnt++;
    				}
    			}
    		}
    		result += cnt==1 ? prev : String.valueOf(cnt) + prev; 

    		if(answer > result.length()) {
    			answer = result.length();
    		}
    	}
    	
    	return answer;
    }
}