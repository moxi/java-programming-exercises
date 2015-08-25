package org.rcgonzalezf;

import java.util.List;
import java.util.Objects;

public class GivenTreePrintAllPaths {

    public synchronized void givenTreePrintAllPaths(Node<Character> node, List<Node<Character>> path) {
        if(node == null) {
            return;
        }
        path.add(node);

        if(node.left == null && node.right == null) {
            for(Node<Character> n : path) {
                System.out.print(n.data);
            }
            System.out.println();
        } else {
            givenTreePrintAllPaths(node.left, path);
            givenTreePrintAllPaths(node.right, path);
        }

        path.remove(node);
    }

    public static class Node<T> {
        Node<T> left;
        Node<T> right;
        T data;

        public Node(Node<T> left, Node<T> right, T data) {
            this.left = left;
            this.right = right;
            this.data = data;
        }

        public Node(T data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(left, node.left) &&
                    Objects.equals(right, node.right) &&
                    Objects.equals(data, node.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right, data);
        }
    }
}
