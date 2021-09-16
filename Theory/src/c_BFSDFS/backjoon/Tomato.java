package c_BFSDFS.backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
    public static int[][] map;
    public static int[] dirX = {1, 0, -1, 0};
    public static int[] dirY = {0, 1, 0, -1};
    public static int M, N;
    public static Queue<Graph> q = new LinkedList<>();
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
                
        map = new int[M][N];
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1) q.offer(new Graph(i,j));
            }
        }
        
        bfs();
        
        System.out.println(getResult());
    }
    
    public static void bfs() {
        while (!q.isEmpty()) {
            Graph g = q.poll();
            int nextCost = map[g.x][g.y] + 1;
            for (int i=0; i<4; i++) {
                int nextX = g.x + dirX[i];
                int nextY = g.y + dirY[i];
                if (nextX < 0 || nextX >= M || nextY < 0 || nextY >= N) continue;
                if (map[nextX][nextY] < 0 || map[nextX][nextY] == 1) continue;
                if (map[nextX][nextY] != 0 && map[nextX][nextY] <= nextCost) continue;
                map[nextX][nextY] = nextCost;
                q.offer(new Graph(nextX, nextY));
            }
        }
    }
    
    public static int getResult() {
        int result = 0;
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (map[i][j] == 0) return -1;
                if (map[i][j] > result) result = map[i][j];
            }
        }
        return result-1;
    }
    
    static class Graph {
        int x;
        int y;
        
        Graph (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

