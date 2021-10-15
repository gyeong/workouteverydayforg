package z_algorithm.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.junit.jupiter.api.Test;

class UniqueCharacterInString {
    /*
     * Task
     * HashSet을 사용하여 값을 가지고 있는지 확인
     * 굳이 HashSet을 써아햐는 이유는? -> LinkedList도 contain 있는데!!
     */
    
    @Test
    void test() {
        assertThat(UniqueCharacterInString("abcd"), is(true));
    }

    private boolean UniqueCharacterInString(String string) {
        LinkedList<Character> set = new LinkedList<>();
        for (int i=0; i<string.length(); i++) {
            if (set.contains(string.charAt(i))) {
                return false;
            }
            set.add(string.charAt(i));
        }
        return true;
    }

}
