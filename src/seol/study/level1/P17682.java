package seol.study.level1;

import java.util.Stack;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 다트게임.
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/17682
 */
public class P17682 {
	enum Type {
    	Single("S", v->v), Double("D", v->v*v), Triple("T", v->v*v*v), Star("*", v->v*2), Acha("#", v->v*-1);
    	final String type;
    	final Function<Integer, Integer> function;
    	Type(String type, Function<Integer, Integer> function) {
    		this.type = type;
    		this.function = function;
    	}
		public static Type getType(String value) {
			switch (value) {
			case "S":
				return Single; 
			case "D":
				return Double;
			case "T":
				return Triple;
			case "*":
				return Star;
			case "#":
				return Acha;
			default:
				return Single;
			}
		}
    }
    
    public int solution(String dartResult) {
    	Stack<Integer> stack = new Stack<Integer>();
    	Pattern p1 = Pattern.compile("([0-9]{1,2}[STD]{1}[*#]{0,1})");
    	Matcher m1 = p1.matcher(dartResult);
    	
    	while(m1.find()) {
			Pattern p2 = Pattern.compile("([0-9]{1,2})([STD]{1})([*#]{0,1})");
			Matcher m2 = p2.matcher(m1.group());
			
			while(m2.find()) {
				int value = Integer.parseInt(m2.group(1));
				value = Type.getType(m2.group(2)).function.apply(value);
				
				Type special = Type.getType(m2.group(3));
				if(special==Type.Star && !stack.isEmpty()) {
					Integer prevVal = stack.pop();
					prevVal = special.function.apply(prevVal);
					stack.push(prevVal);
				}
				value = special.function.apply(value);
				stack.push(value);
			}
    	}
    	
    	return stack.stream()
					.reduce((accVal, val)->accVal+val)
					.orElse(0);
    }
}