package seol.study.level1;

import java.util.Scanner;

/**
 * 직사각형 별찍기.
 * @author seol
 * @see	https://programmers.co.kr/learn/courses/30/lessons/12969
 */
public class P12969 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int colSize = sc.nextInt();
        int rowSize = sc.nextInt();

        for(int row=0; row<rowSize; row++) {
        	for(int col=0; col<colSize; col++) {
        		System.out.print("*");
        		if(col+1==colSize) {
        			System.out.println();
        		}
        	}
        }
    }
}