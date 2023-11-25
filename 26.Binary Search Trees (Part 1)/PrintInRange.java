public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left Subtree
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void print(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            print(root.left, k1, k2);
            System.out.println(root.data + " ");
            print(root.right, k1, k2);
        }
        else if(root.data < k1){
            print(root.left, k1, k2);
        }
        else{
            print(root.right , k1, k2);
        }
    }

    public static void main(String args[]){
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        print(root, 5, 12);
        
    }
}
