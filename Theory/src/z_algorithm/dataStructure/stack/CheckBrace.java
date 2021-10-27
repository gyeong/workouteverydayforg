package z_algorithm.dataStructure.stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Stack;

import org.junit.jupiter.api.Test;
class CheckBrace {

    @Test
    void test() {
        assertThat(solution("(())"), is(true));
        assertThat(solution("()()"), is(true));
        assertThat(solution(")(())("), is(false));
        assertThat(solution("(())("), is(false));
        assertThat(solution(")(())"), is(false));
        assertThat(solution("(()"), is(false));
        assertThat(solution("())"), is(false));

        assertThat(solution("(asdc;aga;ac;dsc;)"), is(true));
        assertThat(solution("(aaa(bbb)ccc)"), is(true));
    }

    public boolean solution(String data) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<data.length(); i++) {
            char brace = data.charAt(i);
            if (brace == "(".charAt(0)) {
                stack.push(brace);
            } else if (brace == ")".charAt(0)) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
