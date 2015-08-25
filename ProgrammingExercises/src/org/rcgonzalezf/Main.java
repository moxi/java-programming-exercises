package org.rcgonzalezf;

import java.util.ArrayList;

import static org.rcgonzalezf.GivenTreePrintAllPaths.Node;

public class Main {

    /*
                  A
              B       D
                c   E   F
         Should print ABC, ADE, ADF
    */
    public static void main(String... args) {
        Node<Character> C = new Node<>('C');
        Node<Character> B = new Node<>(null, C, 'B');
        Node<Character> E = new Node<>('E');
        Node<Character> F = new Node<>('F');
        Node<Character> D = new Node<>(E, F, 'D');
        Node<Character> A = new Node<>(B, D, 'A');

        GivenTreePrintAllPaths printer = new GivenTreePrintAllPaths();
        printer.givenTreePrintAllPaths(A,  new ArrayList<>());

    }
}
