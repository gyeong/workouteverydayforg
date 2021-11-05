package zz_fastcampus.set01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/21922
public class Problem05 {
    public static int N, M;
    public static int[][] map;
    public static int[] dirX = {0, 0, -1, 1};
    public static int[] dirY = {1, -1, 0, 0};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int airX = 0;
        int airY = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        
        sc.nextLine();
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) { 
                map[i][j] = sc.nextInt();
                if (map[i][j] == 9) {
                    airX = i;
                    airY = j;
                }
            }
            sc.nextLine();
        }
        
        bfs(airX, airY);
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<Point>();
        q.offer(new Point(x,y,0,0));
        
        while (!q.isEmpty()) {
            Point p = q.poll();
            map[p.x][p.y] = -1;
            for (int i=0; i<4; i++) {
                int nextX = p.x + dirX[i];
                int nextY = p.y + dirY[i];
                if (nextX >= N || nextX < 0 || nextY >= M || nextY < 0) continue;
                if (map[nextX][nextY] == -1) continue;
                if (!checkPosition(p, dirX[i], dirY[i])) continue;
                
                q.offer(new Point(nextX, nextY, dirX[i], dirY[i]));
            }
        }
        
    }
    
    public static boolean checkPosition(Point p, int newX, int newY) {
        switch (map[p.x][p.y]) {
        case 1:
            if (newX != 0) return false;
            break;
        case 2:
            if (newY != 0) return false;
            break;
        case 3:
            if (p.newX == 1 && newY != 1) return false;
            else if (p.newX == -1 && newY != -1) return false;
            else if (p.newY == 1 && newX != 1) return false;
            else if (p.newY == -1 && newX != -1) return false;
            break;
        case 4:
            if (p.newX == 1 && newY != -1) return false;
            else if (p.newX == -1 && newY != 1) return false;
            else if (p.newY == 1 && newX != -1) return false;
            else if (p.newY == -1 && newX != 1) return false;
            break;
         default:
             break;
        }
        
        return true;
    }
    
    static class Point {
        int x;
        int y;
        int newX;
        int newY;
        
        Point (int x, int y, int newX, int newY) {
            this.x = x;
            this.y = y;
            this.newX = newX;
            this.newY = newY;
        }
    }

}
