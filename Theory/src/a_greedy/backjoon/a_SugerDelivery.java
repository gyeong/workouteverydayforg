package a_greedy.backjoon;

import java.util.Scanner;

public class a_SugerDelivery {
    public static int[] bags = { 5, 3 };

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int totalSuger = sc.nextInt();
        int result=0;
        
        if (totalSuger < 3 || totalSuger > 5000) {
            System.out.println(-1);
            return;
        }
        
        while (true) {
            if ( totalSuger%5 == 0) {
                result += totalSuger/5;
                break;
            }
            totalSuger = totalSuger - 3;
            result++;
            
            if (totalSuger < 0) {
                result = -1;
                break;
            }
        }
        
        if (totalSuger == 0) System.out.println(result);
        else System.out.println(result);
    }
}
