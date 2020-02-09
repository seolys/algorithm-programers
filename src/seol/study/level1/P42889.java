package seol.study.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 실패율.
 * @author seol
 * @see	https://programmers.co.kr/learn/courses/30/lessons/42889
 */
public class P42889 {
	
	int[] score = {};
    public int[] solution(int N, int[] stages) {
    	score = new int[N+1];
    	
    	for(int s:stages) {
    		score[s-1]++;
    	}
    	
    	int cnt = stages.length;
    	List<ScoreVO> perList = new ArrayList<ScoreVO>();
    	for(int i=0; i<score.length-1; i++) {
    		if(score[i]==0) {
    			perList.add(new ScoreVO(i, 0));
    		} else {
    			perList.add(new ScoreVO(i, (double)score[i]/cnt));
    		}
    		cnt = cnt - score[i];
    	}
    	
    	int[] answer = perList.stream()
    					      .sorted( Comparator.comparing(ScoreVO::getSuccPer).reversed().thenComparing(ScoreVO::getStage) )
    					      .map(vo->vo.getStage()+1)
    					      .mapToInt(i->i)
    					      .toArray();
        return answer;
    }
}

class ScoreVO {
	private double succPer;
	private int stage;
	public ScoreVO(int stage, double succPer) {
		this.stage = stage;
		this.succPer = succPer;
	}
	public double getSuccPer() {
		return succPer;
	}
	public int getStage() {
		return stage;
	}
}