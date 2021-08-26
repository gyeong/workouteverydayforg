package b_implement;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ResortString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int length = 0, resultNum = 0;
        PriorityQueue<Character> charQueue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) - 'A' + 1 > 0)
                charQueue.offer(input.charAt(i));
            else 
                resultNum += Integer.parseInt(Character.toString(input.charAt(i)));
        }
        
        length = charQueue.size();
        for (int i=0; i<length; i++) {
            System.out.print(charQueue.poll());
        }
        System.out.println(resultNum);
    }

}
