package z_algorithm.basicMath;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class FindPrimeNum {

    @Test
    void test() {
        assertThat(solution(-3), is(-1));
        assertThat(solution(0), is(0));
        assertThat(solution(1), is(0));
        assertThat(solution(2), is(1));
        assertThat(solution(3), is(2));
        assertThat(solution(8), is(4));
        assertThat(solution(12), is(5));
        assertThat(solution(44), is(14));
    }

    private int solution(int num) {
        int result = 0;
        boolean flag = false;
        if (num < 0) {
            return -1;
        }
        if (num <= 1) {
            return 0;
        }
        
        for (int i=2; i<= num; i++) {
            flag = false;
            for (int j=2; j<=i; j++) {
               if (i == j) {
                   continue;
               }
               
               if (i%j == 0) {
                   flag = true;
               }
            }
            if (!flag) {
                System.out.println(i);
                result++;
            }
        }
        
        return result;
    }
}
