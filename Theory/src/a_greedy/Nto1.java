package a_greedy;

import java.util.Scanner;

public class Nto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int K = sc.nextInt();
		int N = 3;
		int K = 26;
		System.out.println(solution(N, K));
	}
	
	public static int solution (int N, int K) {
		int result = 0;
		while (N != 1) {
			if (N % K == 0) {
				N = N / K;
			} else {
				N = N - 1;
			}
			result++;
		}
		
		return result;
	}

}
