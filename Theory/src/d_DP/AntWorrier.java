package d_DP;

import java.util.Scanner;

public class AntWorrier {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(dp(N));
    }
    
    public static int dp(int N) {
        int result = 0;
        for (int i=0; i<N; i++) {
            
        }
        
        return N;
    }

}
