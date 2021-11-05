package a_greedy.ndb;

import java.util.HashMap;
import java.util.List;

public class Mukbang {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] food_times = new int[4];
        long k = 5;
        
        food_times[0] = 3;
        food_times[1] = 1;
        food_times[2] = 2;
        
        System.out.println(solution(food_times, k));
    }
    
    public static int solution(int[] food_times, long k) {
        int answer = 0;
        int num = 0;
        for (int i=0; i<=k; i++) {
            if (i > food_times.length-1) {
                num = i%(food_times.length-1);
            } else {
                num = i;
            }
            
            if (food_times[num] == 0) {
                k = k+1;
                continue;
            }
            
            food_times[num] = food_times[num] - 1;
            answer = num+1;
        }
        return answer;
    }

}
