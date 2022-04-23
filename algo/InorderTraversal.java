package gfg.fb;

import java.util.Stack;

public class InorderTraversal {

    Node root;

    InorderTraversal() {
        this.root = null;
    }

    static class Node {
        int data;
        Node left,right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }




    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();
        tree.root  = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
//        printInorder(tree.root);

        printInorderNoRecursion(tree.root);
    }

    private static void printInorderNoRecursion(Node root) {
        Stack<Node> stack = new Stack<>();

        stack.push(root);
        Node currNode = root.left;

        while (currNode!=null || stack.size()>0) {

            while (currNode!=null) {
                stack.push(currNode);
                currNode = currNode.left;
            }

            Node node = stack.pop();
            System.out.println(node.data);
            currNode = node.right;

        }
    }

    static void printInorder(Node root) {
        System.out.println(root.data);

        if(root.left != null) {
            printInorder(root.left);
        }
        if(root.right!=null) {
            printInorder(root.right);
        }
    }
}
