package c_conflictTest;

import java.util.LinkedList;
import java.util.Queue;

public class BFSSample {
    
    static Queue<Integer> queue = new LinkedList<>();
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[9];

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BFS(1);
    }
    
    public static void BFS(int data) {
        if (!visited[data]) {
            queue.offer(data);
            visited[data] = true;
        }
        
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            System.out.print(poll + " -> ");
            for (int i=0; i<graph[poll].length; i++) {
                if (visited[graph[poll][i]]) continue;
                else {
                    visited[graph[poll][i]] = true;
                    queue.offer(graph[poll][i]);
                }
            }
        }
    }
}
