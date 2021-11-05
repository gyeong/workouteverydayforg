package zz_fastcampus.set01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// https://www.acmicpc.net/problem/21919
// 최소공배수 LCM : a*b / 최대공약수
// 최대공약수 GCD : 재귀 ( GCD(b, a%b) ) 
public class Problem02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long answer = 1;
        
        sc.nextLine();
        for (int i=0; i<N; i++) {
            long x = sc.nextLong();
            if (isPrime(x)) {
                answer = LCM(answer, x);
            }
        }
        
        if (answer == 1) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
    
    static boolean isPrime(long x) {
        for (int i=2; i*i <= x; i++) {
            if (x % i == 0) 
                return false;
        }
        return true;
    }
    
    static long LCM(long a, long b) {
        return (a*b) / GCD(a, b);
    }
    
    static long GCD(long a, long b) {
        if (b == 0) 
            return a;
        return GCD(b, a%b);
    }

}
