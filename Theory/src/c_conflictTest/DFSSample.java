package c_conflictTest;

import java.util.LinkedList;

public class DFSSample {
    
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static LinkedList<Integer> stack = new LinkedList<>();
    static boolean[] visited = new boolean[9];
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DFS(1);
    }
    
    public static void DFS(int num) {
        stack.push(num);
        visited[num] = true;
        System.out.print( num + "->");
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            for (int i=0; i<graph[pop].length; i++) {
                if (visited[graph[pop][i]]) continue;
                else DFS(graph[pop][i]);
            }
        }
    }

}
