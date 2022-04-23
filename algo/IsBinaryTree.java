package graph;

public class IsBinaryTree {
    public static class Node {
        private int value;
        private Node left;
        private Node right;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(3);
        Node l1L = new Node(2);
        Node l1R = new Node(4);

        Node l2L = new Node(0);
        Node l2R = new Node(1);

        root.left = l1L;
        root.right = l1R;

        root.left.left = l2L;
        root.left.right = l2R;



        boolean isBinary = checkBinary(root, true);
        System.out.println(isBinary);

    }

    public static boolean checkBinary(Node root, boolean flag) {
        if((root.left==null && root.right==null) || !flag)
            return flag;

        if(root.left.value>root.value || root.right.value<root.value)
            return false;

        return checkBinary(root.left, flag) && checkBinary(root.right, flag);
    }
}
