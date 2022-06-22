/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectlybalancedtree;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
class Node {

    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
    }
}

public class PerfectlyBalancedTree {

    static Scanner sc = new Scanner(System.in);

    public static Node Tree(int n) {
        if (n == 0) {
            return null;
        } else {
            var nl = n / 2;
            var nr = n - nl - 1;
            System.out.print("Masukkan key: ");
            var x = sc.nextInt();
            var newNode = new Node(x);
            newNode.left = Tree(nl);
            newNode.right = Tree(nr);
            return newNode;
        }
    }

    public static void printTree(Node t, int h) {
        int i = 0;
        if (t != null) {
            printTree(t.left, h + 1);
            for (i = 0; i < h; i++) {
                System.out.print("  ");
            }
            System.out.println(t.key);
            printTree(t.right, h + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();
        Node hasil = Tree(n);
        printTree(hasil, 0);
    }
}
