package c_BFSDFS.backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeSearching {

    public static int[][] map = {};
    public static boolean[][] visited = {};
    public static int[] dirX = {1, 0, -1, 0};
    public static int[] dirY = {0,-1, 0, 1};
    public static int N = 0;
    public static int M = 0;
    public static LinkedList<Maze> ll = new LinkedList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];
        sc.nextLine();
        
        for (int i=1; i<=N; i++) {
            String line = sc.nextLine();
            for (int j=1; j<=M; j++) {
                map[i][j] =  line.charAt(j-1)  - '0';
            }
        }
        visited[1][1] = true;
        ll.push(new Maze(1, 1));
        //dfs(1,1);
        bfs(1,1);
        System.out.println(map[N][M]);
    }
    
    public static void dfs(int x, int y) {
        while (!ll.isEmpty()) {
            Maze m = ll.pollLast();
            for (int i=0; i<4; i++) {
                int nextX = m.getX() + dirX[i];
                int nextY = m.getY() + dirY[i];
                int nextCost = map[m.getX()][m.getY()] + 1;
                
                if (nextX <= 0 || nextX > N || nextY <= 0 || nextY > M) continue;
                if (visited[nextX][nextY] || map[nextX][nextY] == 0) continue;
                visited[nextX][nextY] = true;
                map[nextX][nextY] = nextCost;
                ll.push(new Maze(nextX, nextY));
            }
        }
        
    }
    
    public static void bfs(int x, int y) {
        Queue<Maze> q = new LinkedList<>();
        q.offer(new Maze(x, y));
        visited[x][y] = true;
        
        while (!q.isEmpty()) {
            Maze m = q.poll();
            for (int i=0; i<4; i++) {
                int nextX = m.getX() + dirX[i];
                int nextY = m.getY() + dirY[i];
          
                if (nextX <= 0 || nextX > N || nextY <= 0 || nextY > M) continue;
                if (map[nextX][nextY] == 0 || visited[nextX][nextY]) continue;
                q.offer(new Maze(nextX, nextY));
                map[nextX][nextY] = map[m.getX()][m.getY()] + 1;
                visited[nextX][nextY] = true;
            }
        }
    }
}

class Maze {
    int x;
    int y;
    
    public Maze(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}