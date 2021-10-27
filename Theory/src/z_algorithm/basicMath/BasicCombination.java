package z_algorithm.basicMath;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicCombination {

    /*
     * Task 
     * https://minhamina.tistory.com/38
     * nCr = n-1Cr-1 + n-1Cr
     * n개의 숫자 중 r개의 숫자를 순서 상관없이 뽑는 경우의 수
     */
    @Test
    void test() {
        assertThat(getByRecursion(2,1), is(2));
        assertThat(getByRecursion(8,3), is(56));
        
        assertThat(getByDp(2,1), is(2));
        assertThat(getByDp(8,3), is(56));
    }

    private int getByRecursion(int n, int r) {
        //System.out.println(n + ", " + r);
        if (r == 0 || n == r) 
            return 1;
        
        return getByRecursion(n-1, r-1) + getByRecursion(n-1, r);
    }

    private int getByDp(int n, int r) {
        int cache[][] = new int[10][10];
        if (r == 0 || n == r) return 1;
        
        if (cache[n][r] != 0) return cache[n][r];
        return cache[n][r] = getByDp(n-1, r-1) + getByDp(n-1, r);
    }
}
