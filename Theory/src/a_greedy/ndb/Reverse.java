package a_greedy.ndb;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1439
public class Reverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int numZero = 0;
        int numOne = 0;
        
        if (input.charAt(0) == '0') {
            numZero++;
        } else {
            numOne++;
        }
        
        for (int i=0; i<input.length()-1; i++) {
            if (input.charAt(i) != input.charAt(i+1)) {
                if (input.charAt(i) == '0') {
                    numOne++;
                } else {
                    numZero++;
                }
            }
        }
        
        System.out.println(Math.min(numZero, numOne));
    }

}
