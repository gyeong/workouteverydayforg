	package a_greedy.backjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class C_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total = sc.nextInt();
		int result = 0;
		LinkedList<Integer> coins = new LinkedList<>();
		
		for (int i=0; i<N; i++) {
			int input = sc.nextInt();
			coins.add(input);
		}
		
		for (int i=0; i<N; i++) {
			int poll = coins.pollLast();
			if ( total < poll) continue;
			result += total / poll;
			total %= poll;
			
		}
		System.out.println(result);
	}

}
