package z_algorithm.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class StringCompress {
    /* 
     * Task
     * StringBuilder sb!
     * forEach를 통한 lambda 사용
     */

    @Test
    void test() {
        assertThat(stringCompress("aaabbbbccd"), is("a3b4c2d1"));
    }

    private String stringCompress(String string) {
        Map<Character, Integer> compress = new HashMap<>();
        
        for (char c : string.toCharArray()) {
            if (compress.containsKey(c)) {
                compress.replace(c, compress.get(c) + 1);
            } else {
                compress.put(c, 1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        compress.forEach((c, count) -> sb.append(c + count.toString()));
        return sb.toString();
    }

}
