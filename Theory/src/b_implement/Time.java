package b_implement;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		String checkStr = "3";
		
		for (int h=0; h<=N; h++) {
			for (int m=0; m<60; m++) {
				for (int s=0; s<60; s++) {
					String time = Integer.toString(h) + Integer.toString(m) + Integer.toString(s);
					if (time.indexOf(checkStr) >= 0) result++;
				}
			}
		}
		
		System.out.println(result);
	}

}
