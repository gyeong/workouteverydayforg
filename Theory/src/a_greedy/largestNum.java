package a_greedy;

import java.util.Scanner;

public class largestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		System.out.println(solution(num));
	}
	
	public static int solution(String num) {
		int result = num.charAt(0) - '0';		
		for (int i=1; i<num.length(); i++) {
			int numItem = num.charAt(i) - '0';
			if (result == 0 || result == 1 || numItem == 0 || numItem == 1) {
				result += numItem;
			} else {
				result *= numItem;
			}
		}
		return result;
	}

}
