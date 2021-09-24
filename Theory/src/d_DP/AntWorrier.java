package d_DP;

import java.util.Scanner;

public class AntWorrier {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] result = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        
        result[0] = arr[0];
        result[1] = Math.max(arr[0], arr[1]);
        
        for (int i=2; i<N; i++) {
            result[i] = Math.max(result[i-1], result[i-2]+arr[i]);
        }
        
        System.out.println(result[N-1]);
    }
    
    

}
