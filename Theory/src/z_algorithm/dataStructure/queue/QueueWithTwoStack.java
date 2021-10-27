package z_algorithm.dataStructure.queue;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class QueueWithTwoStack {

    /*
        TASK
        Stack 두 개로 Queue를 구현한다.
     */

    @Test
    public void test() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        assertThat(queue.size(), is(4));

        assertThat(queue.poll(), is(1));
        assertThat(queue.poll(), is(2));
        assertThat(queue.poll(), is(3));
        assertThat(queue.poll(), is(4));

        assertThat(queue.size(), is(0));
    }
    
    public class MyQueue<T> {
        Stack<Integer> stackA;
        Stack<Integer> stackB;
        
        public MyQueue() {
            stackA = new Stack<Integer>();
            stackB = new Stack<Integer>();
        }
        
        public void offer(int num) {
            while (!stackB.isEmpty()) {
                stackA.push(stackB.pop());
            }
            
            stackA.push(num);
            
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        
        public int size() {
            return stackB.size();
        }
        
        public int poll() {
            return stackB.pop();
        }
    }
}
