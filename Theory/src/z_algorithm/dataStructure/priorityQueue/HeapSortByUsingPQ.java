package z_algorithm.dataStructure.priorityQueue;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.PriorityQueue;

import org.junit.jupiter.api.Test;

public class HeapSortByUsingPQ {

    /*
        TASK
        Priority queue를 사용하여 heap sort를 하라.
     */

    @Test
    public void test() {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 1;
        arr[3] = 9;
        arr[4] = 6;

        int[] sortedArr = new int[5];
        sortedArr[0] = 1;
        sortedArr[1] = 3;
        sortedArr[2] = 6;
        sortedArr[3] = 7;
        sortedArr[4] = 9;
        assertThat(heapSort(arr), is(sortedArr));
    }
    
    public int[] heapSort(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int[] sortedArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            queue.offer(arr[i]);
        }
        
        for (int i=0; i<sortedArr.length; i++) {
            sortedArr[i] = queue.poll();
        }
        
        return sortedArr;
    }
}
