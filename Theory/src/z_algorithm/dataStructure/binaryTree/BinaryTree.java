package z_algorithm.dataStructure.binaryTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinaryTree {

    @Test
    public void test() {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;

        assertThat(getMax(node1), is(4));
        assertThat(isBalanced(node1), is(true));

        int[] arr = {1,5,7,9,12,26,56,78};
        assertThat(isBST(buildBST(arr)), is(true));
    }
    
    /*
     * TASK 오름차순으로 정렬된 배열을 Binary Search Tree로 변환한다. 트리의 높이를 최소화 하면서
     *  (즉 complete binary tree로) 변환한다.
     */
    public Node buildBST(int[] arr) {
        Node node = new Node();
        
        return node;
    }
    
    private Node buildBSTRec(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int middle = start + (end-start)/2;
        Node leftNode = buildBSTRec(arr, start, middle - 1);
        Node rightNode = buildBSTRec(arr, middle + 1, end);
        
        return new Node(arr[middle], leftNode, rightNode);
    }
    
    public int getMax(Node node) {
        return 1;
    }
    
    public boolean isBalanced(Node node) {
        return true;
    }
    
    public boolean isBST(Node node) {
        return true;
    }
    
    public class Node {
        int data;
        Node left;
        Node right;
        
        public Node() {}
        
        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

}
