package z_algorithm.basicMath;



import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class Ladder {

    @Test
    void test() {
        assertThat(solution(0), is(1));
        assertThat(solution(1), is(1));
        assertThat(solution(2), is(2));
        assertThat(solution(3), is(3));
        assertThat(solution(4), is(5));
        assertThat(solution(5), is(8));
        assertThat(solution(6), is(13));
        assertThat(solution(7), is(21));
    }
    
    private int solution(int num) {
        //return recursion(num);
        return dp(num, new int[num+1]);
    }

    private int recursion(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 2) {
            return num;
        }
        
        return recursion(num-1) + recursion(num-2);
    }
    
    private int dp(int num, int[] cache) {
        if (num == 0) {
            return 1;
        }
        
        if (num < 2) {
            return num;
        }
        
        if (cache[num] != 0) return cache[num];
        
        cache[num] = dp(num-1, cache) + dp(num-2, cache);
        return cache[num];
    }
}
