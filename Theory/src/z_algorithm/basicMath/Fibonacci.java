package z_algorithm.basicMath;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class Fibonacci {

    @Test
    void test() {
        assertThat(calcFiboByFor(5), is(5));
        assertThat(calcFiboByFor(6), is(8));
        assertThat(calcFiboByFor(7), is(13));
        
        assertThat(calcFiboByRec(5), is(5));
        assertThat(calcFiboByRec(6), is(8));
        assertThat(calcFiboByRec(7), is(13));
        
        assertThat(fiboByDp(5), is(5));
        assertThat(fiboByDp(6), is(8));
        assertThat(fiboByDp(7), is(13));
    }

    // DP
    private int fiboByDp(int num) {
       return calcFibo(num, new int[num + 1]); 
    }
    
    private int calcFibo(int num, int[] cache) {
        if (num < 2) {
            return num;
        }
        // 이미 작업한 내용은 pass ( 불필요한 작업 X)
        if (cache[num] != 0) {
            return cache[num];
        }
        
        // fib : n = (n-1) + (n-2)
        cache[num] = calcFibo(num - 1, cache) + calcFibo(num - 2, cache);
        return cache[num];
    }

    // Recursion
    private int calcFiboByRec(int num) {
        if (num < 2) {
            return num;
        }
        return calcFiboByRec(num-1) + calcFiboByRec(num-2);
    }
    
    // For
    private int calcFiboByFor(int num) {
        int prevResult = 1;
        int result = 1;
        
        if (num < 2) {
            return result;
        }
        
        for (int i=2; i<num; i++) {
            int temp = result;
            result = result + prevResult;
            prevResult = temp;
            
        }
        return result;
    }
    
    

}
