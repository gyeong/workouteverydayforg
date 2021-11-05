package zz_fastcampus.set01;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        String[] cmd = new String[M];
        
        for (int i=1; i<N+1; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        
        for (int i=0; i<M; i++) {
            cmd[i] = sc.nextLine();
        }
        
        System.out.println();
        
        for (int i=0; i<M; i++) {
            String[] cmdArr = cmd[i].split(" ");
            int arg1 = Integer.parseInt(cmdArr[1]);
            int arg2 = Integer.parseInt(cmdArr[2]);
            
            if (cmdArr[0].equals("1")) {
                arr[arg1] = arg2;
            } else if (cmdArr[0].equals("2")) {
                for (int j=arg1; j<=arg2; j++) {
                    arr[j] = arr[j] == 0 ? 1 : 0;
                }
            } else if (cmdArr[0].equals("3")) {
                for (int j=arg1; j<=arg2; j++) {
                    arr[j] = 0;
                }
            } else if (cmdArr[0].equals("4")) {
                for (int j=arg1; j<=arg2; j++) {
                    arr[j] = 1;
                }
            }
        }
        
        for (int i=1; i<N+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
