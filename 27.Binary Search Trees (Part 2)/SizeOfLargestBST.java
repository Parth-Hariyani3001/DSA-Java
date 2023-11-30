public class SizeOfLargestBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
  
        }
    }

    public static int maxBSTSize = 0;

    public static Info largestBST(Node root){
        // Base case -> if the root is null then it is a BST
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // 1) Getting the info from left and the right subtree
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // 2) Calculating the Info for the current Node
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        // 3) If the root.data is less than left.max or root.data greater than right.min then root.isBST = false
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }

        // 3) If the left.isBST == true and right.isBST == true then root.isBST = true
        if(leftInfo.isBST && rightInfo.isBST){
            maxBSTSize = Math.max(maxBSTSize, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void main(String args[]){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);
        System.out.println("Largest BST Size = " + maxBSTSize);
    }
}
