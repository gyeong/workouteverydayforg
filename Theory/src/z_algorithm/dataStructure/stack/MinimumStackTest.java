package z_algorithm.dataStructure.stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class MinimumStackTest {

    @Test
    void test() {
        MyStack stack = new MyStack();
        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.push(2);
        stack.push(6);

        assertThat(stack.min(), is(2));
    }

    public class MyStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        
        public MyStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }
        
        public void push(int num) {
            stack.push(num);
            if (minStack.isEmpty() || minStack.peek() > num) {
                minStack.push(num);
            }
        }
        
        public int min() {
            return minStack.peek();
        }
    }
}
