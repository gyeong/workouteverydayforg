package z_algorithm.basicMath;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class SumEachNum {

    @Test
    void test() {
        assertThat(solution(0), is(0));
        assertThat(solution(235), is(10));
        assertThat(solution(235678), is(31));
        assertThat(solution(-1), is(1));
    }

    private int solution(int num) {
        int result = 0;
        num = Math.abs(num); // 절대값
        
        while (num < 10) {
            result += num % 10;
            num = (num - (num % 10)) / 10;
        }
        
        return result + num;
    }
    
}
