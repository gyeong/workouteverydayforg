package b_implement;

import java.util.Scanner;

public class Knight {
	public static int[] stepTwo = {2, 2, -2, -2};
	public static int[] stepLeft = {-1, 0, -1, 0};
	public static int[] stepRight = {0, 1, 0, 1};
	public static String[] chess = {"a", "b", "c", "d", "e", "f", "g", "h"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String current = sc.nextLine();
		int x=0, y=0, result=0;
		
		for (int i=0; i<chess.length; i++) {
			if (current.indexOf(chess[i]) >= 0) {
				x = i+1;
				y = Integer.parseInt(current.split("")[1]);
			}
		}
		
		for (int i=0; i<4; i++) {
		    int x1 = x + stepTwo[i];
		    int y1 = y + stepLeft[i] + stepRight[i];
		    int x2 = x + stepLeft[i] + stepRight[i];
		    int y2 = y + stepTwo[i];
		    
		    if (x1 >= 1 && x1 <= chess.length && y1 >=1 && y1 < chess.length) result++;
		    if (x2 >= 1 && x2 <= chess.length && y2 >=1 && y2 < chess.length) result++;
		}
		
		System.out.println(result);
		
	}
	
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 현재 나이트의 위치 입력받기
//        String inputData = sc.nextLine();
//        int row = inputData.charAt(1) - '0';
//        int column = inputData.charAt(0) - 'a' + 1;
//
//        // 나이트가 이동할 수 있는 8가지 방향 정의
//        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
//        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
//
//        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
//        int result = 0;
//        for (int i = 0; i < 8; i++) {
//            // 이동하고자 하는 위치 확인
//            int nextRow = row + dx[i];
//            int nextColumn = column + dy[i];
//            // 해당 위치로 이동이 가능하다면 카운트 증가
//            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
//                result += 1;
//            }
//        }
//
//        System.out.println(result);
//    }

}
