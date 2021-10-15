package z_algorithm.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class StringReverse {

    @Test
    void test() {
        assertThat(stringReverse("abc"), is("cba"));
    }

    private String stringReverse(String str) {
        char[] strArr = str.toCharArray();
        char[] result = new char[strArr.length];
        
        for (int i=0; i<strArr.length; i++) {
            result[result.length - i - 1] = strArr[i];
        }
        
        return String.copyValueOf(result);
    }
}
