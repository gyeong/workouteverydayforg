package z_algorithm.dataStructure.priorityQueue;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.PriorityQueue;

import org.junit.jupiter.api.Test;

public class CalcTopTen {

    /*
        TASK
        많은 수 중 top 10을 구한다.
     */

    @Test
    public void test() {
        TopTen t = new TopTen();
        t.put(1);
        t.put(2);
        t.put(3);
        t.put(4);
        t.put(5);
        t.put(6);
        t.put(7);
        t.put(8);
        t.put(9);
        t.put(10);
        t.put(11);
        t.put(12);
        t.put(19);
        t.put(21);
        t.put(13);
        int[] arr = new int[10];
        int j = 0;
        for (int i = arr.length; i > 0; i--) {
            arr[j] = i;
            j++;
        }
        assertThat(t.getTop10(), is(arr));
    }

    public class TopTen {
        PriorityQueue<Integer> queue; 
        
        public TopTen() {
            queue = new PriorityQueue<Integer>();
        }
        
        public void put(int num) {
            queue.offer(num);
        }
        
        public int[] getTop10() {
            int[] arr = new int[10];
            for (int i=arr.length-1; i>= 0; i--) {
                arr[i] = queue.poll();
            }
            
            return arr;
        }
    }
}
