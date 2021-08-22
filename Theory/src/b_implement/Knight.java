package b_implement;

import java.util.Scanner;

public class Knight {
	public static int[] dirX = {1, 0, -1, 0};
	public static int[] dirY = {0, -1, 0, 1};
	public static String[] chess = {"a", "b", "c", "d", "f", "g", "h"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String current = sc.nextLine();
		int x=0, y=0;
		
		for (int i=0; i<chess.length; i++) {
			if (current.indexOf(chess[i]) >= 0) {
				x = i+1;
				y = Integer.parseInt(current.split("")[1]);
			}
		}
		
		
		System.out.println(x + "," + y);
		
	}

}
