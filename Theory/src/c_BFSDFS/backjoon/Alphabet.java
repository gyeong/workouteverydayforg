package c_BFSDFS.backjoon;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Alphabet {
    public static int N, M;
    public static String[][] map;
    public static boolean[][] visited;
    public static int[] dirX = {1, 0, -1, 0};
    public static int[] dirY = {0, 1, 0, -1};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new String[N][M];
        visited = new boolean[N][M];
        sc.nextLine();
        
        for (int i=0; i<N; i++) {
            String input = sc.nextLine();
            for (int j=0; j<M; j++) {
                map[i][j] = Character.toString(input.charAt(j));
            }
        }
        
        System.out.println(bfs(0,0));
    }
    
    public static int bfs(int x, int y) {
        int step = 0;
        HashMap<String, Boolean> alphabet = new HashMap<>();
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        
        while (!q.isEmpty()) {
            Point p = q.poll();
            System.out.println(map[p.x][p.y]);
            alphabet.put(map[p.x][p.y], true);
            visited[p.x][p.y] = true;
            step++;
            for (int i=0; i<4; i++) {
                int nextX = p.x + dirX[i];
                int nextY = p.y + dirY[i];
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) continue;
                if (visited[nextX][nextY] || alphabet.containsKey(map[nextX][nextY])) continue;
                System.out.println(alphabet + " , " + map[nextX][nextY]);
                q.offer(new Point(nextX, nextY));
            }
        }
        
        return alphabet.size();
    }

    static class Point {
        int x;
        int y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
