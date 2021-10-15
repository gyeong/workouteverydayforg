package z_algorithm.basicMath;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GcdAndGcm {

    /* 
     *  Task
     *  최소공약수 : a % b -> b가 0일때까지 반복
     *  최대공배수 : a * b / 최소공약수
     */
    @Test
    void test() {
        assertThat(gcdByIteration(6, 8), is(2));
        assertThat(gcdByRecursion(6, 8), is(2));
        assertThat(gcm(6, 8), is(24));
    }

    private int gcdByIteration(int i, int j) {
        int mod;
        
        while (j != 0) {
            mod = i % j;
            i = j;
            j = mod;
            System.out.println(mod + " , " + i + ", " + j);
        }
        return i;
    }
    
    private int gcdByRecursion(int i, int j) {
        if (j == 0) {
            return i;
        }
        
        return gcdByRecursion(j, i%j);
    }

    private int gcm(int i, int j) {
        return (i * j / gcdByRecursion(i,j));
    }
}
