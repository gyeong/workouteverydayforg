package b_implement;

import java.util.Scanner;
public class UpDownLeftRight {
	public static int[] dirX = {1, 0, -1, 0};
	public static int[] dirY = {0, -1, 0, 1};
	public static String[] dir = {"R", "U", "L", "D"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int x = 1, y = 1;
		int nextX = x, nextY = y;
		String[] str = sc.nextLine().split(" ");
		
		for (int i=0; i<str.length; i++) {
			for (int j=0; j<dir.length; j++) {
				if (str[i].equals(dir[j])) {
					nextX = x + dirX[j];
					nextY = y + dirY[j];
				} 
				if (nextX < 1 || nextY < 1 || nextX > N || nextY > N) continue;
				x = nextX;
				y = nextY;
			}
		}
		
		System.out.println(x + " , " + y);
	}
}
