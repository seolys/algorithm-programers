package seol.study.level2;

/**
 * 전화번호 목록
 * @author seol
 * @see https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class P42577 {
	public boolean solution(String[] phone_book) {
        int size = phone_book.length;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){            
                if(i==j){
                    continue;
                }
                if(phone_book[i].startsWith(phone_book[j])){
                    return false;
                }
            }
        }
        
        return true;
    }
}