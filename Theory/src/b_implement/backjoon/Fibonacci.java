package b_implement.backjoon;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0, fib = 1;
        
        for (int i=0; i<N; i++) {
            int temp = result;
            result = result + fib;
            fib = temp;
        }
        
        System.out.println(result);
        
    }

}
