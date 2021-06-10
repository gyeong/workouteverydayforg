package a_greedy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Advanturer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println(solution(list));
	}

	public static int solution(LinkedList<Integer> list) {
		int result = 0;
		int group = 0;
		
		Collections.sort(list);
		for (int i=0; i<list.size(); i++) {
			group++;
			if (group == list.get(i)) {
				result++;
				group = 0;
			}
		}
		return result;
	}
}
