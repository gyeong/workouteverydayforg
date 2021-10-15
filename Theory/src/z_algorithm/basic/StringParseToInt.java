package z_algorithm.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class StringParseToInt {
    /*
     * Task
     * 주어진 문자열을 int형으로 변환한다.
     */

    @Test
    void toIntFromString() {
        assertThat(toIntfromString("123"), is(123));
    }

    private int toIntfromString(String string) {
        // 1. String을 Character 배열로 변환
        // 2. base * 10 을 통해 'base0' 생성
        // 3. Character - '0' 을 통해 Int로 변환 및 더함
        char[] strArr = string.toCharArray();
        int base = 0;
        for (int i=0; i<strArr.length; i++) {
            System.out.println(base*10);
            System.out.println(strArr[i] - '0');
            base *= 10;
            base += strArr[i] - '0';
        }
        
        return base;
    }

}
