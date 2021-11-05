package zz_fastcampus.set01;

import java.util.Scanner;
// https://www.acmicpc.net/problem/21921
public class Problem04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int tmp = 0;
        int cnt = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        sc.nextLine();
        
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        
        for (int i=0, j=0; j<N; ) {
            for (;j-i < M;) {
                tmp += arr[j++];
            }
            if (result == tmp) {
                cnt++;
            }
            if (result < tmp) {
                result = tmp;
                cnt = 1;
            }
            tmp -= arr[i++];
        }

        if (result == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(result);
            System.out.println(cnt);
        }
    }

}
