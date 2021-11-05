package zz_fastcampus.set01;

import java.util.Scanner;

// https://www.acmicpc.net/problem/21920
public class Problem03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];
        long result = 0;
        long cnt = 0;
        
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        
        for (int i=0; i<N; i++) {
            int gcd = solution(num, arr[i]);
            if (gcd == 1) {
                cnt ++;
                result += arr[i];
            }
        }
        
        
        System.out.printf("%.6f", (double)result / cnt);
    }

    static int solution(int a, int b) {
        if (b == 0) {
            return a;
        }
        return solution(b, a%b);
    }
}
