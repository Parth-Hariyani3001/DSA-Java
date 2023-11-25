public class ValidBST {
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

    public static boolean isValidBST(Node root,Node min,Node max){
        if(root == null){
            return true;
        }

        //Root ka data min se kam nahi hona chaaiye
        if(min != null && root.data <= min.data){
            return false;
        } 
        //Root ka data max se zyaada nahi hona chaaiye
        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static void main(String args[]){
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if(isValidBST(root, null, null)){
            System.out.println("It is a valid BST");
        } else {
            System.out.println("It is not a valid BST");
        }
    }
}