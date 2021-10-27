package z_algorithm.dataStructure.stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Stack;

import org.junit.jupiter.api.Test;
class IsPalindromeTest {
    /*
     * TASK Stack 자료구조를 사용하여 회문을 판별한다.
     */
    @Test
    void test() {
        assertThat(isPalindrome("abba"), is(true));
        assertThat(isPalindrome("dabccbad"), is(true));
        assertThat(isPalindrome("abcba"), is(true));
        assertThat(isPalindrome("fabccdedccbaf"), is(true));
        assertThat(isPalindrome("fabccdedccbf"), is(false));
    }
    
    public boolean isPalindrome(String data) {
        Stack<Character> stack = new Stack<Character>();
        
        for (int i=0; i<data.length(); i++) {
            stack.push(data.charAt(i));
        }
        
        for (int i=0; i<data.length()/2; i++) {
            if (stack.pop() != data.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
