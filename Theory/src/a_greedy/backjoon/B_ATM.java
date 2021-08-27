package a_greedy.backjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class B_ATM {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i=0; i<N; i++) {
            int input = sc.nextInt();
            queue.add(input);
        }
        
        for (int i=0; i<N; i++) {
            int poll =  queue.poll();
            System.out.println(poll +"," +result);
            result = result + poll + poll;
        }
        
        System.out.println(result);
    }

}
