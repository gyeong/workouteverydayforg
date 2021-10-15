package z_algorithm.basic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.PriorityQueue;


import org.junit.jupiter.api.Test;

class IsAnagram {

    @Test
    void test() {
        assertThat(isAnagram("car", "rca"), is(true));
        assertThat(isAnagram("caabbbb", "abababc"), is(false));
    }


    private boolean isAnagram(String str, String compStr) {
        // TODO Auto-generated method stub
        PriorityQueue<Character> queue = new PriorityQueue<Character>();
        PriorityQueue<Character> compQueue = new PriorityQueue<Character>();
        
        for (char chr : str.toCharArray()) {
            queue.add(chr);
        }
        for (char chr : compStr.toCharArray()) {
            compQueue.add(chr);
        }
        
        if (queue.size() != compQueue.size()) {
            return false;
        }

        for (int i=0; i<str.length(); i++) {
            if (queue.poll() != compQueue.poll()) {
                return false;
            }
        }
        return true;
    }

}
