package seol.study.level1;

import java.util.LinkedList;
import java.util.List;

/**
 * K번째수
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class P42748 {
	public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];
        
        for(int i=0; i< size; i++){
            int[] command = commands[i];
            
            int start = command[0]-1;
            int end = command[1];
            int idx = command[2]-1;
            List<Integer> list = new LinkedList<Integer>();
            for(int j=start; j<end; j++){
                list.add(array[j]);
            }
            list.sort(Integer::compareTo);
            answer[i] = list.get(idx); 
        }
        
        return answer;
    }
}