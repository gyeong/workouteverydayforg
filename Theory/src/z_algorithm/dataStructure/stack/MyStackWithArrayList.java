package z_algorithm.dataStructure.stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyStackWithArrayList {

    @Test
    void test() {
        MyStack<Integer> stack = new MyStack<Integer>();
        
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
    
    public class MyStack<T> {
        ArrayList<Integer> data;
        
        public MyStack() {
            data = new ArrayList<Integer>();
        }
        
        public void push(int num) {
            System.out.println(data.size());
            data.add(num);
        }
        
        public int pop() {
            return data.remove(data.size()-1);
        }
    }

}
