package seol.study.level2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 오픈채팅방
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/42888
 */
public class P42888 {
	public String[] solution(String[] record) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        for(String rec : record) {
        	String[] recArr = rec.split(" ");
        	
        	String keyword = recArr[0];
        	String userId  = recArr[1];
        	if("Enter".equals(keyword) || "Change".equals(keyword)) {
        		map.put(userId, recArr[2]);
        	}
        }
        
        List<String> result = new ArrayList<String>();
        for(String rec : record) {
        	String[] recArr = rec.split(" ");
        	String keyword = recArr[0];
        	String userId  = recArr[1];
        	if("Enter".equals(keyword)) {
        		result.add(map.get(userId)+"님이 들어왔습니다.");
        	} else if ("Leave".equals(keyword)) {
        		result.add(map.get(userId)+"님이 나갔습니다.");
        	}
        }
        
        String[] answer = result.toArray(new String[result.size()]);
        return answer;
    }
}