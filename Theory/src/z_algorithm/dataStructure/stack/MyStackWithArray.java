package z_algorithm.dataStructure.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class MyStackWithArray {

    @Test
    void test() {
        MyStack stack = new MyStack();
        
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        assertThat(stack.pop(), is(6));
        assertThat(stack.pop(), is(5));
        assertThat(stack.pop(), is(4));
        assertThat(stack.pop(), is(3));
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
        assertThat(stack.pop(), is(0));
    }
    
    public class MyStack {
        private int[] data = new int[7];
        private int topIndex = -1;
        
        public synchronized void push(int i) { 
            topIndex++;
            if (topIndex <= data.length) {
                data[topIndex] = i;
            }
        }
        
        public synchronized int pop() {
            if (topIndex < 0) {
                throw new RuntimeException("Empty Stack!");
            }
            
            return data[topIndex--];
        }
    }

}
